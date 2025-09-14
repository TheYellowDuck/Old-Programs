package com.example.myfridge.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Item::class], version = 5, exportSchema = false)
abstract class ItemDatabase : RoomDatabase() {
    abstract fun itemDao(): ItemDao

    companion object {
        @Volatile
        private var Instance: ItemDatabase? = null

        fun getDatabase(context: Context): ItemDatabase {
            if (Instance == null) {
                Instance = Room.databaseBuilder(context.applicationContext, ItemDatabase::class.java, "items_database").build()
            }
            println(context.applicationContext)
            println(Instance)
            return Instance!!
//            return Instance ?: synchronized(lock = this) {
//                return Room.databaseBuilder(context, ItemDatabase::class.java, "items_database")
//                    .fallbackToDestructiveMigration()
//                    .build()
//                    .also { Instance = it }
//            }
        }
    }
}