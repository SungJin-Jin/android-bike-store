package com.ev.bikestore.ui.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ev.bikestore.ui.type.ChooseUserTypeScreen

@ExperimentalMaterialApi
@Composable
fun MainScreen() {
    Box(
        modifier = Modifier.fillMaxHeight()
            .fillMaxWidth(),

    ) {
        ChooseUserTypeScreen()
    }

}