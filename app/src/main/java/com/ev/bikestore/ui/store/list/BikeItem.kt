package com.ev.bikestore.ui.store.list

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ev.bikestore.entity.Bike
import com.ev.bikestore.ui.theme.BikeStoreTheme

@Composable
fun BikeItem(bike: Bike) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .padding(
                horizontal = 12.dp,
                vertical = 8.dp,
            ),
        backgroundColor = MaterialTheme.colors.primary,
        shape = RoundedCornerShape(12.dp),
        elevation = 2.dp,
    ) {
        Column(
            modifier = Modifier
                .padding(24.dp)
        ) {
            Text(
                text = bike.name,
                color = Color.White,
                style = MaterialTheme.typography.h6,
                modifier = Modifier.padding(vertical = 2.dp)
            )
            Text(
                text = bike.shopName,
                color = Color.White,
                style = MaterialTheme.typography.caption,
            )
            Text(
                text = bike.manufacturer,
                color = Color.White,
                style = MaterialTheme.typography.caption,
            )
            Text(
                text = "lat : ${bike.latitude}, lng: ${bike.longitude}",
                color = Color.White,
                style = MaterialTheme.typography.caption,
            )
        }
    }
}

@ExperimentalMaterialApi
@Preview(showBackground = true)
@Composable
fun BikeItemPreview() {
    BikeStoreTheme {
        BikeItem(
            bike = Bike(
                id = 0,
                shopName = "MyBikeShop1",
                latitude = 70.0f,
                longitude = -120f,
                manufacturer = "Brompton",
                name = "Comp"
            )
        )
    }
}