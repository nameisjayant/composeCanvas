package com.nameisjayant.canvascompose


import androidx.compose.foundation.Canvas
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.DrawStyle
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun DrawIconWithCanvas() {

    LazyColumn(
        modifier = Modifier
            .padding(vertical = 20.dp, horizontal = 16.dp)
    ) {
        item {
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Icons Made With Canvas",
                    style = MaterialTheme.typography.headlineSmall.copy(
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Monospace
                    ),
                    textDecoration = TextDecoration.Underline,
                    textAlign = TextAlign.Center,
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
        }
        item {
            FlowRow(
                modifier = Modifier.border(
                    2.dp, Color.Black, RoundedCornerShape(16.dp)
                )
            ) {
                MenuIcon()
                CheckIcon()
                KeyboardBackArrow()
                KeyboardForwardArrowIcon()
                KeyboardArrowDownIcon()
                KeyboardArrowUpIcon()
                ArrowBackIcon()
                ArrowForwardIcon()
                ArrowDownIcon()
                ArrowUpIcon()
                HomeIcon()
                AddIcon()
                AddIconWithCircle()
                MoreVertIcon()
                CreateHoriIcon()
            }
        }
    }
}

@Composable
fun CreateHoriIcon(
    modifier: Modifier = Modifier
) {
    Canvas(
        modifier = modifier
            .padding(20.dp)
            .size(20.dp)
    ) {
        val width = size.width
        val size = size.width / 5

        createCircle(
            offset = Offset.Zero,
            size = size
        )
        createCircle(
            offset = Offset(width / 2f, 0f),
            size = size
        )
        createCircle(
            offset = Offset(width, 0f),
            size
        )
    }
}

@Composable
fun MoreVertIcon(
    modifier: Modifier = Modifier
) {
    Canvas(
        modifier = modifier
            .padding(20.dp)
            .size(20.dp)
    ) {
        val height = size.height
        val size = size.width / 5
        createCircle(
            offset = Offset.Zero,
            size = size
        )
        createCircle(
            offset = Offset(0f, height / 2f),
            size = size
        )
        createCircle(
            offset = Offset(0f, height),
            size = size
        )
    }
}

@Composable
fun AddIconWithCircle(
    modifier: Modifier = Modifier
) {
    Canvas(
        modifier = modifier
            .padding(20.dp)
            .size(20.dp)
    ) {
        val height = size.height
        val width = size.width
        createCircle(
            offset = center,
            size = size.width / 1.5f,
            style = Stroke(width = 5f)
        )
        createLine(
            start = Offset((width / 13) * 3, height / 2),
            end = Offset((width / 3.8f) * 3, height / 2)
        )
        createLine(
            start = Offset(width / 2, (height / 13) * 3),
            end = Offset(width / 2, (height / 3.8f) * 3)
        )
    }
}

@Composable
fun AddIcon(
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
            end = Offset(width, height / 2)
        )
        createLine(
            start = Offset(width / 2, 0f),
            end = Offset(width / 2, height)
        )
    }
}

@Composable
fun HomeIcon(
    modifier: Modifier = Modifier
) {
    Canvas(
        modifier = modifier
            .padding(20.dp)
            .size(30.dp)
    ) {
        val height = size.height
        val width = size.width

        createLine(
            start = Offset(
                width / 2f, 0f
            ),
            end = Offset(
                0f, height / 2.5f
            )
        )
        createLine(
            start = Offset(
                width / 2, 0f
            ),
            end = Offset(
                width, height / 2.5f
            )
        )
        createLine(
            start = Offset(10f, height / 2.8f),
            end = Offset(10f, height)
        )
        createLine(
            start = Offset(width - 10, height / 2.8f),
            end = Offset(width - 10, height)
        )
        createLine(
            start = Offset(10f, height),
            end = Offset(width / 2.5f, height)
        )
        createLine(
            start = Offset(width - 10, height),
            end = Offset(width / 1.6f, height)
        )
        createLine(
            start = Offset(width / 2.5f, height),
            end = Offset(width / 2.5f, height / 1.8f)
        )
        createLine(
            start = Offset(width / 1.6f, height),
            end = Offset(width / 1.6f, height / 1.8f)
        )
        createLine(
            start = Offset(width / 2.5f, height / 1.8f),
            end = Offset(width / 1.6f, height / 1.8f)
        )
    }
}

@Composable
fun ArrowUpIcon(
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
                0f, height / 2.5f
            )
        )
        createLine(
            start = Offset(
                width / 2, 0f
            ),
            end = Offset(
                width, height / 2.5f
            )
        )
        createLine(
            start = Offset(
                width / 2, 0f
            ),
            end = Offset(width / 2, height)
        )
    }
}

@Composable
fun ArrowDownIcon(
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
            start = Offset(0f, height / 2f),
            end = Offset(width / 2, height)
        )
        createLine(
            start = Offset(width, height / 2f),
            end = Offset(width / 2, height)
        )
        createLine(
            start = Offset(
                width / 2, 0f
            ),
            end = Offset(width / 2, height)
        )
    }
}

@Composable
fun ArrowForwardIcon(
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
            start = Offset(width / 2f, 0f),
            end = Offset(width, height / 2)
        )
        createLine(
            start = Offset(width / 2f, height),
            end = Offset(width, height / 2)
        )
        createLine(
            start = Offset(0f, height / 2),
            end = Offset(width, height / 2)
        )
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
            start = Offset(0f, height / 2),
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

fun DrawScope.createCircle(
    offset: Offset,
    size: Float,
    color: Color = Color.Black,
    style: DrawStyle = Fill
) {
    drawCircle(
        color = color,
        radius = size,
        center = offset,
        style = style
    )
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
        strokeWidth = 5f,
        cap = cap
    )
}