package com.ev.bikestore.repository

import com.ev.bikestore.dao.BikeDao
import com.ev.bikestore.entity.Bike
import javax.inject.Inject

class BikeRepository @Inject constructor(
    private val bikeDao: BikeDao
) {

    suspend fun findAll(): List<Bike> {
//        return bikeDao.findAll()
        return listOf(
            Bike(
                id = 0,
                shopName = "MyBikeShop1",
                latitude = 70.0f,
                longitude = -120f,
                manufacturer = "Brompton",
                name = "Comp"
            ),
            Bike(
                id = 0,
                shopName = "MyBikeShop2",
                latitude = -30.0f,
                longitude = 80f,
                manufacturer = "Trek",
                name = "Cello"
            ),
        )
    }

    suspend fun save(bike: Bike) = bikeDao.insert(bike)
}