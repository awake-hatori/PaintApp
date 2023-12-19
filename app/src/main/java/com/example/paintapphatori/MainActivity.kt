package com.example.paintapphatori

import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.drawscope.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.paintapphatori.ui.theme.PaintAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PaintAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ScreenLayout()
                }
            }
        }
    }

    @Composable
    fun ScreenLayout() {
        // 左上のテキスト
        Text(
            text = "図形",
            modifier = Modifier.offset(60.dp, 8.dp),
            fontSize = 25.sp
        )
        Text(
            text = "太さ",
            modifier = Modifier.offset(60.dp, 57.dp),
            fontSize = 25.sp
        )
        Text(
            text = "色",
            modifier = Modifier.offset(72.dp, 126.dp),
            fontSize = 25.sp
        )
        var shapesImage by remember { mutableStateOf(R.drawable.circle) }
        // 中央のボタン
        Box() {
            Image(painter = painterResource(id = R.drawable.circle),
                contentDescription = null,
                modifier = Modifier
                    .offset(126.dp, 5.dp)
                    .size(40.dp)
                    .clickable { shapesImage = R.drawable.circle })
        }
        Box() {
            Image(painter = painterResource(id = R.drawable.square),
                contentDescription = null,
                modifier = Modifier
                    .offset(171.dp, 5.dp)
                    .size(40.dp)
                    .clickable { shapesImage = R.drawable.square })
        }
        Box() {
            Image(painter = painterResource(id = R.drawable.triangle),
                contentDescription = null,
                modifier = Modifier
                    .offset(216.dp, 5.dp)
                    .size(40.dp)
                    .clickable { shapesImage = R.drawable.triangle })
        }
        var streamWidthImage by remember { mutableStateOf(R.drawable.stream_width3) }
        Box() {
            Image(painter = painterResource(id = R.drawable.stream_width3),
                contentDescription = null,
                modifier = Modifier
                    .offset(125.dp, 55.dp)
                    .size(40.dp)
                    .clickable { streamWidthImage = R.drawable.stream_width3 })
        }
        Box() {
            Image(painter = painterResource(id = R.drawable.stream_width5),
                contentDescription = null,
                modifier = Modifier
                    .offset(170.dp, 56.dp)
                    .size(40.dp)
                    .clickable { streamWidthImage = R.drawable.stream_width5 })
        }
        var colorImage by remember { mutableStateOf(R.drawable.black) }
        Row(
            modifier = Modifier.offset(121.dp, 105.dp)
        ) {
            Box() {
                Image(painter = painterResource(id = R.drawable.black), contentDescription = null,
                    modifier = Modifier
                        .padding(1.dp)
                        .size(33.dp)
                        .clickable { colorImage = R.drawable.black })
            }
            Box() {
                Image(painter = painterResource(id = R.drawable.red), contentDescription = null,
                    modifier = Modifier
                        .padding(1.dp)
                        .size(33.dp)
                        .clickable { colorImage = R.drawable.red })
            }
            Box() {
                Image(painter = painterResource(id = R.drawable.oreange), contentDescription = null,
                    modifier = Modifier
                        .padding(1.dp)
                        .size(33.dp)
                        .clickable { colorImage = R.drawable.oreange })
            }
            Box() {
                Image(painter = painterResource(id = R.drawable.yellow), contentDescription = null,
                    modifier = Modifier
                        .padding(1.dp)
                        .size(33.dp)
                        .clickable { colorImage = R.drawable.yellow })
            }
            Box() {
                Image(painter = painterResource(id = R.drawable.green), contentDescription = null,
                    modifier = Modifier
                        .padding(1.dp)
                        .size(33.dp)
                        .clickable { colorImage = R.drawable.green })
            }
        }
        Row(
            modifier = Modifier.offset(121.dp, 142.dp)
        ) {
            Box() {
                Image(painter = painterResource(id = R.drawable.blue), contentDescription = null,
                    modifier = Modifier
                        .padding(1.dp)
                        .size(33.dp)
                        .clickable { colorImage = R.drawable.blue })
            }
            Box() {
                Image(painter = painterResource(id = R.drawable.purple), contentDescription = null,
                    modifier = Modifier
                        .padding(1.dp)
                        .size(33.dp)
                        .clickable { colorImage = R.drawable.purple })
            }
            Box() {
                Image(painter = painterResource(id = R.drawable.pink), contentDescription = null,
                    modifier = Modifier
                        .padding(1.dp)
                        .size(33.dp)
                        .clickable { colorImage = R.drawable.pink })
            }
            Box() {
                Image(painter = painterResource(id = R.drawable.yellowgreen),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(1.dp)
                        .size(33.dp)
                        .clickable { colorImage = R.drawable.yellowgreen })
            }
            Box() {
                Image(painter = painterResource(id = R.drawable.lightbule),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(1.dp)
                        .size(33.dp)
                        .clickable { colorImage = R.drawable.lightbule })
            }
        }
        // 右上の画像
        Box() {
            Image(painter = painterResource(id = shapesImage),
                contentDescription = null,
                modifier = Modifier
                    .offset(310.dp, 5.dp)
                    .padding(1.dp)
                    .size(40.dp))
        }
        Box() {
            Image(painter = painterResource(id = streamWidthImage),
                contentDescription = null,
                modifier = Modifier
                    .offset(310.dp, 55.dp)
                    .padding(1.dp)
                    .size(40.dp))
        }
        Box() {
            Image(painter = painterResource(id = colorImage),
                contentDescription = null,
                modifier = Modifier
                    .offset(310.dp, 120.dp)
                    .padding(1.dp)
                    .size(40.dp))
        }
        Canvas(
            modifier = Modifier,
            onDraw = {
                // 線
                drawLine(Color.Blue, Offset(0f, 150f), Offset(1100f, 150f), strokeWidth = 3f)
                drawLine(Color.Blue, Offset(0f, 300f), Offset(1100f, 300f), strokeWidth = 3f)
                drawLine(Color.Blue, Offset(0f, 550f), Offset(1100f, 550f), strokeWidth = 3f)
                drawLine(Color.Blue, Offset(350f, 0f), Offset(350f, 550f), strokeWidth = 3f)
                drawLine(Color.Blue, Offset(900f, 0f), Offset(900f, 550f), strokeWidth = 3f)
                // 左上のアイコン
                scale(0.15f, 0.15f) {
                    val shapesBitmap =
                        BitmapFactory.decodeResource(resources, R.drawable.shapes)
                    drawImage(
                        image = shapesBitmap.asImageBitmap(),
                        topLeft = Offset(-3230f, -4700f),
                    )
                }
                scale(0.22f, 0.22f) {
                    val lineWidthBitmap =
                        BitmapFactory.decodeResource(resources, R.drawable.line_width)
                    drawImage(
                        image = lineWidthBitmap.asImageBitmap(),
                        topLeft = Offset(-1880f, -2130f),
                    )
                }
                scale(0.115f, 0.115f) {
                    val paletteBitmap =
                        BitmapFactory.decodeResource(resources, R.drawable.palette)
                    drawImage(
                        image = paletteBitmap.asImageBitmap(),
                        topLeft = Offset(-4250f, -2900f),
                    )
                }
            }
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        PaintAppTheme {
            ScreenLayout()
        }
    }
}