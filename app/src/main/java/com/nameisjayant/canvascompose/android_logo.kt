package com.nameisjayant.canvascompose

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke

@Composable
fun AndroidLogo() {
    val color = Color(0XFF4FAF54)
    Canvas(modifier = Modifier.fillMaxSize()) {
        drawPath(
            color = Color.Red,
            path = Path().apply {
                // create face
                drawArc(
                    startAngle = 180f,
                    sweepAngle = 180f,
                    useCenter = true,
                    style = Stroke(width = 20f),
                    color = color,
                    topLeft = Offset(size.width / 4, size.height / 2.34f),
                    size = Size(size.width / 2, size.height / 4)
                )
                // left head line
                drawLine(
                    color = color,
                    start = Offset(size.width / 7, size.height / 3f),
                    end = Offset(size.width / 2.4f, size.height / 2.3f),
                    strokeWidth = 20f
                )
                // right head line
                drawLine(
                    color = color,
                    start = Offset(size.width / 1.2f, size.height / 3),
                    end = Offset(size.width / 1.7f, size.height / 2.3f),
                    strokeWidth = 20f
                )
                // left eye
                drawCircle(
                    color = Color.Black,
                    radius = 15f,
                    center = Offset(size.width / 2.5f, size.height / 2)
                )
                // right eye
                drawCircle(
                    color = Color.Black,
                    radius = 15f,
                    center = Offset(size.width / 1.7f, size.height / 2f)
                )
            },
        )
    }
}