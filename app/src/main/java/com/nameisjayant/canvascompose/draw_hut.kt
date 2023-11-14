package com.nameisjayant.canvascompose

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun HutWithCanvasLine(
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Canvas(
            modifier = Modifier
                .padding(horizontal = 20.dp)
                .fillMaxWidth()
                .height(260.dp)
        ) {
            val width = size.width
            val height = size.height

            // hut top part
            drawLine(
                color = Color.Red,
                start = Offset(x = width / 4, y = 0f),
                end = Offset(0f, y = height / 3),
                strokeWidth = 5f
            )
            drawLine(
                color = Color.Red,
                start = Offset(x = width / 4, y = 0f),
                end = Offset(width / 2, y = height / 3),
                strokeWidth = 5f
            )

            drawLine(
                color = Color.Red,
                start = Offset(x = 0f, y = height / 3),
                end = Offset(width / 2, y = height / 3),
                strokeWidth = 5f
            )

            // door outer part
            drawLine(
                color = Color.Blue,
                strokeWidth = 5f,
                start = Offset(x = 0f, y = height / 3),
                end = Offset(x = 0f, y = height)
            )
            drawLine(
                color = Color.Blue,
                strokeWidth = 5f,
                start = Offset(x = width / 2, y = height / 3),
                end = Offset(x = width / 2, y = height)
            )
            drawLine(
                color = Color.Blue,
                strokeWidth = 5f,
                start = Offset(x = 0f, y = height),
                end = Offset(x = width / 2, y = height)
            )

            // Door
            drawLine(
                color = Color.Black,
                strokeWidth = 5f,
                start = Offset(x = (width / 2) / 3, y = height),
                end = Offset(x = (width / 2) / 3, y = height / 2)
            )
            drawLine(
                color = Color.Black,
                strokeWidth = 5f,
                start = Offset(x = (width / 2) / 1.5f, y = height),
                end = Offset(x = (width / 2) / 1.5f, y = height / 2)
            )
            drawLine(
                color = Color.Black,
                strokeWidth = 5f,
                start = Offset(x = (width / 2) / 3, y = height / 2),
                end = Offset(x = (width / 2) / 1.5f, y = height / 2)
            )

            // hut right side part
            drawLine(
                color = Color.Magenta,
                strokeWidth = 5f,
                start = Offset(x = width / 4, y = 0f),
                end = Offset(x = width, y = 0f)
            )
            drawLine(
                color = Color.Magenta,
                strokeWidth = 5f,
                start = Offset(x = width / 2, y = height / 3),
                end = Offset(x = width - 100, y = (height / 3))
            )
            drawLine(
                color = Color.Magenta,
                strokeWidth = 5f,
                start = Offset(x = width, y = 0f),
                end = Offset(x = width - 100, y = height / 3)
            )
            drawLine(
                color = Color.Magenta,
                strokeWidth = 5f,
                start = Offset(x = width, y = 0f),
                end = Offset(x = width, y = height)
            )
            drawLine(
                color = Color.Magenta,
                strokeWidth = 5f,
                start = Offset(x = width - 100, y = height / 3),
                end = Offset(x = width - 100, y = height)
            )
            drawLine(
                color = Color.Magenta,
                strokeWidth = 5f,
                start = Offset(x = width / 2, y = height),
                end = Offset(x = width, y = height)
            )
        }
    }
}