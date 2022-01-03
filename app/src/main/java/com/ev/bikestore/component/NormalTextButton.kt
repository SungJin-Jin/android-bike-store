package com.ev.bikestore.component

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.style.TextAlign

@Composable
fun NormalTextButton(
    modifier: Modifier = Modifier,
    textModifier: Modifier = Modifier,
    text: String = "",
    shape: Shape = RectangleShape,
    colors: ButtonColors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.primary),
    onClick: () -> Unit = {},
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        colors = colors,
        shape = shape,
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.subtitle1,
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = textModifier
        )
    }
}