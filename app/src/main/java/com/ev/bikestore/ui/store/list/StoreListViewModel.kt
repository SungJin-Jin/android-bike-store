package com.ev.bikestore.ui.store.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ev.bikestore.entity.Bike
import com.ev.bikestore.repository.BikeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class StoreListViewModel @Inject constructor(
    private val bikeRepository: BikeRepository
) : ViewModel() {

    private val _bikes = MutableLiveData<List<Bike>>()
    val bikes: LiveData<List<Bike>> = _bikes

    init {
        fetchBikes()
    }

    private fun fetchBikes() {
        viewModelScope.launch {
            runCatching { bikeRepository.findAll() }
                .onSuccess { _bikes.value = it }
                .onFailure {  }
        }
    }
}