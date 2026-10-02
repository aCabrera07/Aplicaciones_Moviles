package com.example.columnas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Blue)
        ) {
            item {
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(400.dp),
                    painter = painterResource(id = R.drawable.prueba_jp),
                    contentDescription = "Ajedrez"
                )
                Text(
                    "Hola mundo",
                    fontSize = 32.sp,
                    color = Color.White,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
                Text("Aaron Antonio Acosta Ledezma", color = Color.White)
                Text("Jesua Ivan Mercado Ríos", color = Color.White)
            }
        }
    }
}
