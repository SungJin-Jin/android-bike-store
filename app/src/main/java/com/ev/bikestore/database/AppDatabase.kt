package com.ev.bikestore.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.ev.bikestore.entity.Bike

@Database(entities = [Bike::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    companion object {
        fun build(context: Context) : AppDatabase {
            return Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                "bike-store-db"
            ).build()
        }
    }
}