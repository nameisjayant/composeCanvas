package com.nameisjayant.canvascompose


import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun DrawIconWithCanvas() {

    FlowRow(
        modifier = Modifier
            .padding(vertical = 20.dp)
            .fillMaxSize(),
    ) {
        MenuIcon()
        CheckIcon()
        KeyboardBackArrow()
        KeyboardForwardArrowIcon()
        KeyboardArrowDownIcon()
        KeyboardArrowUpIcon()
        ArrowBackIcon()
    }

}

@Composable
fun ArrowBackIcon(
    modifier: Modifier = Modifier
) {
    Canvas(
        modifier = modifier
            .padding(20.dp)
            .size(20.dp)
    ) {
        val height = size.height
        val width = size.width
        createLine(
            start = Offset(0f, height / 2),
            end = Offset(width / 2f, 0f)
        )
        createLine(
            start = Offset(0f, height / 2),
            end = Offset(width / 2f, height)
        )
        createLine(
            start = Offset(width / 4f, height / 2),
            end = Offset(width, height / 2)
        )
    }
}

@Composable
fun KeyboardArrowUpIcon(
    modifier: Modifier = Modifier
) {
    Canvas(
        modifier = modifier
            .padding(20.dp)
            .size(20.dp)
    ) {
        val height = size.height
        val width = size.width
        createLine(
            start = Offset(
                width / 2f, 0f
            ),
            end = Offset(
                0f, height / 2f
            )
        )
        createLine(
            start = Offset(
                width / 2, 0f
            ),
            end = Offset(
                width, height / 2f
            )
        )
    }
}

@Composable
fun KeyboardArrowDownIcon(
    modifier: Modifier = Modifier
) {
    Canvas(
        modifier = modifier
            .padding(20.dp)
            .size(20.dp)
    ) {
        val height = size.height
        val width = size.width
        createLine(
            start = Offset(0f, height / 2.5f),
            end = Offset(width / 2, height)
        )
        createLine(
            start = Offset(width, height / 2.5f),
            end = Offset(width / 2, height)
        )
    }
}

@Composable
fun KeyboardForwardArrowIcon(
    modifier: Modifier = Modifier
) {
    Canvas(
        modifier = modifier
            .padding(20.dp)
            .size(20.dp)
    ) {
        val height = size.height
        val width = size.width
        createLine(
            start = Offset(width / 2.5f, 0f),
            end = Offset(width, height / 2)
        )
        createLine(
            start = Offset(width / 2.5f, height),
            end = Offset(width, height / 2)
        )
    }
}

@Composable
fun KeyboardBackArrow(
    modifier: Modifier = Modifier
) {
    Canvas(
        modifier = modifier
            .padding(20.dp)
            .size(20.dp)
    ) {
        val height = size.height
        val width = size.width
        createLine(
            start = Offset(0f, height / 2),
            end = Offset(width / 1.5f, 0f)
        )
        createLine(
            start = Offset(0f, height / 2),
            end = Offset(width / 1.5f, height)
        )
    }
}

@Composable
fun CheckIcon(
    modifier: Modifier = Modifier
) {
    Canvas(
        modifier = modifier
            .padding(20.dp)
            .size(20.dp)
    ) {
        val height = size.height
        val width = size.width
        createLine(
            start = Offset(0f, height / 2),
            end = Offset(width / 2.5f, height)
        )
        createLine(
            start = Offset(width / 2.5f, height),
            end = Offset(width, 0f)
        )
    }
}

@Composable
fun MenuIcon(
    modifier: Modifier = Modifier
) {

    Canvas(
        modifier = modifier
            .padding(20.dp)
            .size(20.dp)
    ) {
        val width = size.width
        val height = size.height
        createLine(
            start = Offset(0f, height / 3),
            end = Offset(width, height / 3),
        )
        createLine(
            start = Offset(0f, height / 1.5f),
            end = Offset(width, height / 1.5f)
        )
        createLine(
            start = Offset(0f, height),
            end = Offset(width, height)
        )
    }
}

fun DrawScope.createLine(
    start: Offset,
    end: Offset,
    color: Color = Color.Black,
    cap: StrokeCap = StrokeCap.Round
) {
    drawLine(
        color = color,
        start = start,
        end = end,
        strokeWidth = 10f,
        cap = cap
    )
}