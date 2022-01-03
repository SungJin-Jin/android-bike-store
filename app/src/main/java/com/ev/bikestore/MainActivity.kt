package com.ev.bikestore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi
import com.ev.bikestore.ui.main.MainScreen
import com.ev.bikestore.ui.theme.BikeStoreTheme

class MainActivity : ComponentActivity() {

    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            BikeStoreTheme {
                MainScreen()
            }
        }
    }
}