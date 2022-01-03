package com.ev.bikestore.ui.type

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ev.bikestore.ui.theme.Background
import com.ev.bikestore.ui.theme.BikeStoreTheme
import com.ev.bikestore.ui.theme.Primary

@ExperimentalMaterialApi
@Composable
fun ChooseUserTypeScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Background),
    ) {
        ChooseUserTypeCard(
            title = "SHOP",
            backgroundColor = Primary,
            onClick = {}
        )
        ChooseUserTypeCard(
            title = "CUSTOMER",
            backgroundColor = Primary,
            onClick = {}
        )
    }
}

@ExperimentalMaterialApi
@Preview(showBackground = true)
@Composable
fun ChooseUserTypePreview() {
    BikeStoreTheme {
        ChooseUserTypeScreen()
    }
}