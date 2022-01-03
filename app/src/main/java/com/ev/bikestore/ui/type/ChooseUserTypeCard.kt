package com.ev.bikestore.ui.type

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
import com.ev.bikestore.ui.theme.BikeStoreTheme


@ExperimentalMaterialApi
@Composable
fun ChooseUserTypeCard(
    title: String,
    backgroundColor: Color,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(260.dp)
            .padding(
                horizontal = 12.dp,
                vertical = 8.dp,
            ),
        backgroundColor = backgroundColor,
        shape = RoundedCornerShape(12.dp),
        elevation = 2.dp,
        onClick = onClick,
    ) {
        Column(
            modifier = Modifier
                .padding(24.dp)
        ) {
            Text(
                text = title,
                color = Color.White,
                style = MaterialTheme.typography.h2,
                modifier = Modifier.padding(vertical = 2.dp)
            )
        }
    }
}

@ExperimentalMaterialApi
@Preview(showBackground = true)
@Composable
fun ChooseUserTypeCardPreview() {
    BikeStoreTheme {
        ChooseUserTypeCard(title = "TITLE", backgroundColor = Color.Black, onClick = {})
    }
}