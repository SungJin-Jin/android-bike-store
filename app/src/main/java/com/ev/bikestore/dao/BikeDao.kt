package com.ev.bikestore.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.ev.bikestore.entity.Bike

@Dao
interface BikeDao {

    @Query("SELECT * FROM bike ORDER BY id DESC")
    suspend fun findAll() : List<Bike>

    @Insert
    suspend fun insert(bike: Bike)
}