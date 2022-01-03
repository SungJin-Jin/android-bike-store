package com.ev.bikestore.ui.type

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ev.bikestore.component.Event
import com.ev.bikestore.ui.main.MainScreenEvent
import com.ev.bikestore.ui.theme.Background
import com.ev.bikestore.ui.theme.BikeStoreTheme
import com.ev.bikestore.ui.theme.Primary

@ExperimentalMaterialApi
@Composable
fun ChooseUserTypeScreen(eventAction: (Event) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Background),
    ) {
        ChooseUserTypeCard(
            title = "Store",
            onClick = { eventAction.invoke(MainScreenEvent.OnClickStoreType) }
        )
        ChooseUserTypeCard(
            title = "Customer",
            onClick = { eventAction.invoke(MainScreenEvent.OnClickCustomerType) }
        )
    }
}

@ExperimentalMaterialApi
@Preview(showBackground = true)
@Composable
fun ChooseUserTypePreview() {
    BikeStoreTheme {
        ChooseUserTypeScreen {}
    }
}