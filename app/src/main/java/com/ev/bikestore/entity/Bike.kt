package com.ev.bikestore.entity

import android.os.Parcelable
import androidx.annotation.FloatRange
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Entity
@Parcelize
data class Bike(
    @PrimaryKey(autoGenerate = true) var id: Long? = null,

    var shopName: String,
    @FloatRange(from = (-90.0), to = 90.0) var latitude: Float,
    @FloatRange(from = (-180.0), to = 180.0) var longitude: Float,
    var manufacturer: String,
    var name: String
) : Parcelable