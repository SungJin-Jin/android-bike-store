package com.ev.bikestore.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ev.bikestore.ui.theme.BikeStoreTheme


val TOOLBAR_HEIGHT = 56.dp

@Composable
fun DefaultAppBar(
    title: String,
    tintColor: Color = Color.White,
    hasBackButton: Boolean = false,
    onClickBackButton: () -> Unit = {}
) {

    Box(
        modifier = Modifier
            .height(TOOLBAR_HEIGHT)
            .fillMaxWidth()
    ) {
        if (hasBackButton) {

            IconButton(
                modifier = Modifier.align(Alignment.CenterStart),
                onClick = onClickBackButton
            ) {
                Icon(Icons.Default.ArrowBack, contentDescription = null, tint = tintColor)
            }
        }
        Text(
            modifier = Modifier.align(Alignment.Center),
            text = title,
            style = MaterialTheme.typography.h6
        )
    }
}

@ExperimentalMaterialApi
@Preview(showBackground = true)
@Composable
fun DefaultAppBarPreview() {
    BikeStoreTheme {
        DefaultAppBar(title = "TITLE")
    }
}