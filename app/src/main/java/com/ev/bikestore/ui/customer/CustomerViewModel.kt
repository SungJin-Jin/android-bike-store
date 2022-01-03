package com.ev.bikestore.ui.customer

import android.location.Location
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ev.bikestore.entity.Bike
import com.ev.bikestore.repository.BikeRepository
import com.google.android.libraries.maps.model.LatLng
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CustomerViewModel @Inject constructor(
    private val bikeRepository: BikeRepository
) : ViewModel() {

    private val _bikeLocations = MutableLiveData<List<LatLng>>()
    val bikeLocations: LiveData<List<LatLng>> = _bikeLocations

    fun updateCurrentLocation(location: Location) {
        fetchBikes(location)
    }

    private fun fetchBikes(currentLocation : Location) {
        viewModelScope.launch {
            runCatching { bikeRepository.findAll() }
                .onSuccess { _bikeLocations.value =
                    it.filter { bike-> bike.toLocation().distanceTo(currentLocation) <= 100 }
                    .map { LatLng(it.latitude.toDouble(), it.longitude.toDouble()) }}
                .onFailure { }
        }
    }

    companion object {
        private const val RADIUS = 1f
    }
}