package com.ev.bikestore.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi
import com.ev.bikestore.component.Event
import com.ev.bikestore.ui.store.StoreActivity
import com.ev.bikestore.ui.theme.BikeStoreTheme
import com.ev.bikestore.utils.startActivity

class MainActivity : ComponentActivity() {

    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            BikeStoreTheme {
                MainScreen(eventAction = ::handleOnAction)
            }
        }
    }

    private fun handleOnAction(event: Event) {
        when (event) {
            MainScreenEvent.OnClickStoreType -> {
                startActivity<StoreActivity>()
            }
        }
    }
}