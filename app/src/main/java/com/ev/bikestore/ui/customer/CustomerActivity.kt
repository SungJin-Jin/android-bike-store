package com.ev.bikestore.ui.customer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi
import com.ev.bikestore.ui.theme.BikeStoreTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CustomerActivity : ComponentActivity() {

    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BikeStoreTheme {
                CustomerScreen()
            }
        }
    }
}