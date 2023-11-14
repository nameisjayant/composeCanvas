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
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp


@Composable
fun CarCanvas() {

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Canvas(
            modifier = Modifier
                .padding(horizontal = 20.dp)
                .fillMaxWidth()
                .height(400.dp)
        ) {
            val width = size.width
            val height = size.height
            drawLine(
                color = Color.Red,
                start = Offset(x = 0f, y = height / 4),
                end = Offset(x = width / 5, y = height / 4),
                strokeWidth = 5f
            )
            drawLine(
                color = Color.Red,
                start = Offset(x = width / 3, y = 0f),
                end = Offset(x = width / 5, y = height / 4),
                strokeWidth = 5f
            )
            drawLine(
                color = Color.Red,
                start = Offset(x = width / 3, y = 0f),
                end = Offset(x = width - 300, y = 0f),
                strokeWidth = 5f
            )
            drawLine(
                color = Color.Red,
                start = Offset(x = width - 300, y = 0f),
                end = Offset(x = width - 200, y = height / 4),
                strokeWidth = 5f
            )
            drawLine(
                color = Color.Red,
                start = Offset(x = width - 200, y = height / 4),
                end = Offset(x = width, y = height / 4),
                strokeWidth = 5f
            )
            drawLine(
                color = Color.Red,
                start = Offset(x = width, y = height / 4),
                end = Offset(x = width, y = height / 2),
                strokeWidth = 5f
            )
            drawLine(
                color = Color.Red,
                start = Offset(x = width, y = height / 2),
                end = Offset(x = width - 200, y = height / 2),
                strokeWidth = 5f
            )
            drawLine(
                color = Color.Red,
                start = Offset(x = 0f, y = height / 4),
                end = Offset(x = 0f, y = height / 2),
                strokeWidth = 5f
            )
            drawArc(
                color = Color.Red,
                startAngle = 180f,
                sweepAngle = 180f,
                useCenter = false,
                topLeft = Offset(x = width / 5, y = height / 2.45f),
                style = Stroke(width = 5f),
                size = Size(200f, 200f)
            )
            drawLine(
                color = Color.Red,
                start = Offset(x = (width / 5) + 200, y = height / 2),
                end = Offset(x = (width / 5) + 380, y = height / 2),
                strokeWidth = 5f
            )
            drawLine(
                color = Color.Red,
                start = Offset(x = 0f, y = height / 2),
                end = Offset(x = width / 5, y = height / 2),
                strokeWidth = 5f
            )
            drawArc(
                color = Color.Red,
                startAngle = 180f,
                sweepAngle = 180f,
                useCenter = false,
                topLeft = Offset(x = width - 400, y = height / 2.45f),
                style = Stroke(width = 5f),
                size = Size(200f, 200f)
            )

            // tires
            drawCircle(
                color = Color.Red,
                radius = 75f,
                center = Offset(x = (width / 5) + 100, y = height / 2)
            )
            drawCircle(
                color = Color.Red,
                radius = 75f,
                center = Offset(x = (width / 5) + 480, y = height / 2)
            )
            // road
            drawLine(
                color = Color.Red,
                start = Offset(x = 0f, y = height / 1.7f),
                end = Offset(x = width, y = height / 1.7f),
                strokeWidth = 5f,
                pathEffect = PathEffect.dashPathEffect(floatArrayOf(10f, 20f), 25f)
            )
        }
    }

}