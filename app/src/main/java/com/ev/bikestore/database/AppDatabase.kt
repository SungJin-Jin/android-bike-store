package com.ev.bikestore.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ev.bikestore.dao.BikeDao
import com.ev.bikestore.entity.Bike

@Database(entities = [Bike::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getBikeDao(): BikeDao
}