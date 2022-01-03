package com.ev.bikestore.ui.store

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.ev.bikestore.component.DefaultAppBar
import com.ev.bikestore.component.NormalTextButton
import com.ev.bikestore.component.TOOLBAR_HEIGHT
import com.ev.bikestore.ui.store.list.BikeItem
import com.ev.bikestore.ui.store.list.StoreListViewModel
import com.ev.bikestore.ui.theme.BikeStoreTheme

@Composable
fun StoreListScreen(
    onClickBikeAdd: () -> Unit = {}
) {

    val viewModel = hiltViewModel<StoreListViewModel>()
    val bikes = viewModel.bikes.observeAsState()

    Scaffold(
        topBar = {
            DefaultAppBar(title = "Store")
        },
        bottomBar = {
            NormalTextButton(
                Modifier
                    .fillMaxWidth()
                    .height(TOOLBAR_HEIGHT),
                text = "Add Bike",
                onClick = { onClickBikeAdd.invoke() }
            )
        }
    ) {

        Column(modifier = Modifier.fillMaxSize()) {
            bikes.value?.forEach { bike ->
                BikeItem(bike = bike)
            }
        }
    }
}

@ExperimentalMaterialApi
@Preview(showBackground = true)
@Composable
fun StoreListScreenPreview() {
    BikeStoreTheme {
        StoreListScreen()
    }
}

