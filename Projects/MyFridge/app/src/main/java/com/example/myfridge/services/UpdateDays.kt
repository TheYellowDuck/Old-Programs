package com.example.myfridge.services

import android.Manifest
import android.app.IntentService
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.example.myfridge.R
import com.example.myfridge.data.Item
import com.example.myfridge.data.ItemDatabase
import com.example.myfridge.data.OfflineItemRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.async
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.Calendar
import java.util.concurrent.TimeUnit

class UpdateDays : IntentService(UpdateDays::class.simpleName) {

    private val CHANNEL_ID = "My Fridge Channel 0"

    private val job = SupervisorJob()
    private val scope = CoroutineScope(Dispatchers.IO + job)

    private fun createNotificationChannel() {
        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = "Background Notification"
            val descriptionText = "Background Notification"
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(CHANNEL_ID, name, importance).apply {
                description = descriptionText
            }
            // Register the channel with the system
            val notificationManager: NotificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }

    override fun onCreate() {
        super.onCreate()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            createNotificationChannel()
            var builder = NotificationCompat.Builder(this, CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_launcher_foreground)
                .setContentTitle("Running in background... ")
                .setContentText("updating expiry dates")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            var notification = builder.build()
            startForeground(1, notification)
        }
    }

    @OptIn(FlowPreview::class)
    override fun onHandleIntent(intent: Intent?) {
        println("updating")

        val offlineItemRepository = OfflineItemRepository(ItemDatabase.getDatabase(context = this).itemDao())
        scope.launch {
            println("grabbing items...")
            val itemList = scope.async {
                println("Flattening item stream")
                offlineItemRepository.getAllItemsStream("myFridge").first()
            }.await()
//            Thread.sleep(5000)
            println("${itemList.size} items")
            for (item in itemList) {
                if (item.expiryDate) {
                    var date: Long = Calendar.getInstance().time.time

                    var daysPassed =
                        TimeUnit.DAYS.convert(date - item.date, TimeUnit.MILLISECONDS)

                    val item = item.copy(
                        name = item.name,
                        expiryDate = item.expiryDate,
                        days = item.days - daysPassed.toInt(),
                        date = date,
                        count = item.count
                    )
                    offlineItemRepository.updateItem(item = item)
                    if (item.days < 0) expiredItemNotification(item)
                }
                println("ID: ${item.id}, Name: ${item.name}, ExpiryDate: ${item.expiryDate}, Days: ${item.days}, Date: ${item.date}, Count: ${item.count}")
            }
            println("done updating")
            stopSelf()
        }
    }

    fun expiredItemNotification(item: Item) {
        println("attempting Notification")
        val context = this
        var builder = NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .setContentTitle("Expired Item")
            .setContentText("${item.count} X ${item.name} have expired")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
        with(NotificationManagerCompat.from(this)) {
            // notificationId is a unique int for each notification that you must define
            if (ActivityCompat.checkSelfPermission(
                    context,
                    Manifest.permission.POST_NOTIFICATIONS
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return
            }
            notify(item.id + 2, builder.build())
            println("Notification Sent")
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        scope.cancel()
        job.cancel()
        println("Destroyed")
    }


}