package com.ev.bikestore.ui.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ev.bikestore.component.Event
import com.ev.bikestore.ui.type.ChooseUserTypeScreen

sealed class MainScreenEvent: Event {

    object OnClickStoreType: MainScreenEvent()

    object OnClickCustomerType: MainScreenEvent()
}

@ExperimentalMaterialApi
@Composable
fun MainScreen(eventAction: (Event) -> Unit) {
    Box(
        modifier = Modifier.fillMaxHeight()
            .fillMaxWidth(),

    ) {
        ChooseUserTypeScreen(eventAction)
    }

}