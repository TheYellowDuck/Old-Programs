package com.example.myfridge.receivers

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import com.example.myfridge.services.UpdateDays
import java.util.Calendar

class BootUpReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {

        if (Intent.ACTION_BOOT_COMPLETED == intent.action) {
            println("boot")
            Thread.sleep(5000)
            val startIntent = Intent(context, UpdateDays::class.java)
            startIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                context.startForegroundService(startIntent);
            } else {
                context.startService(startIntent);
            }

            val alarmManager = context.getSystemService(Context.ALARM_SERVICE) as? AlarmManager

            val calendar: Calendar = Calendar.getInstance().apply {
                timeInMillis = System.currentTimeMillis()
                set(Calendar.HOUR_OF_DAY, 17)
                set(Calendar.MINUTE, 50)
            }
            val alarmIntent = Intent(context, UpdateDays::class.java).let { it ->
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    PendingIntent.getForegroundService(context, 0, it, PendingIntent.FLAG_IMMUTABLE)
                }
                else {
                    PendingIntent.getService(context, 0, it, PendingIntent.FLAG_IMMUTABLE)
                }
            }



// With setInexactRepeating(), you have to use one of the AlarmManager interval
// constants--in this case, AlarmManager.INTERVAL_DAY.
            alarmManager?.setInexactRepeating(
                AlarmManager.RTC,
                calendar.timeInMillis,
                1000 * 60,
//                AlarmManager.INTERVAL_DAY,
                alarmIntent
            )
        }

    }
}