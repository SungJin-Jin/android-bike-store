package com.ev.bikestore.ui.customer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import androidx.hilt.navigation.compose.hiltViewModel
import com.ev.bikestore.ui.map.GoogleMapView
import com.ev.bikestore.ui.theme.BikeStoreTheme
import com.google.android.libraries.maps.model.LatLng
import com.google.android.libraries.maps.model.MarkerOptions
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Composable
fun CustomerScreen() {

    val viewModel = hiltViewModel<CustomerViewModel>()
    val bikeLocations = viewModel.bikeLocations.observeAsState()
    val mapView = GoogleMapView()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        AndroidView({ mapView }) {
            CoroutineScope(Dispatchers.Main).launch {
                mapView.getMapAsync { googleMap ->
                    googleMap.mapType = 1
                    googleMap.uiSettings.isZoomControlsEnabled = true

                    bikeLocations.value?.forEach { bikeLocation ->
                        googleMap.addMarker(MarkerOptions().position(bikeLocation))
                    }
                }

            }
        }
    }
}

@ExperimentalMaterialApi
@Preview(showBackground = true)
@Composable
fun CustomerScreenPreview() {
    BikeStoreTheme {
        CustomerScreen()
    }
}

