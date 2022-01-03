package com.ev.bikestore.ui.store

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ev.bikestore.ui.Destinations

@Composable
fun StoreScreen() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Destinations.STORE_LIST) {
        composable(Destinations.STORE_LIST) {
            // TODO : Add navigation for create bike
            StoreListScreen(onClickBikeAdd = { })
        }
    }
}

