package com.example.columnas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.columnas.ui.theme.ColumnasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ColumnasTheme {
                interfaz()
            }
        }
    }

    @Preview()
    @Composable
    fun interfaz() {
        var counter by rememberSaveable { mutableStateOf(0) }

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Blue)
        ) {
            item {
                Image(
                    modifier = Modifier
                        .fillMaxWidth(),
                    painter = painterResource(id = R.drawable.prueba_jp),
                    contentDescription = "Ajedrez"
                )
                Row(modifier = Modifier
                    .padding(start = 25.dp, top = 5.dp)
                    .fillMaxWidth()) {
                    Image(
                        painter = painterResource(id = R.drawable.baseline_favorite_24),
                        contentDescription = "Like",
                        modifier = Modifier.clickable {counter++}
                    )
                    Text(
                        text = counter.toString(),
                        color = Color.White,
                        modifier = Modifier.padding(start = 5.dp, top = 5.dp)
                    )
                }
                Text(
                    "Hola mundo",
                    fontSize = 32.sp,
                    color = Color.White,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
                Text(
                    "Aaron Antonio Acosta Ledezma",
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            25.dp, 10.dp
                        )
                )
                Text(
                    "Jesua Ivan Mercado Ríos", color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(25.dp, 10.dp)
                )
                LazyRow(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(25.dp, 0.dp)
                ) {
                    item {
                        Text("Sigma", color = Color.White)
                        Text("Beta", color = Color.White)
                        Text("Epsilon", color = Color.White)
                        Text("Aaron", color = Color.DarkGray)
                        Text("Aaron", color = Color.DarkGray)
                        Text("Aaron", color = Color.DarkGray)
                        Text("Aaron", color = Color.DarkGray)
                        Text("Aaron", color = Color.DarkGray)
                        Text("Aaron", color = Color.DarkGray)
                        Text("Aaron", color = Color.DarkGray)
                        Text("Aaron", color = Color.DarkGray)
                    }
                }
            }
        }
    }
}
