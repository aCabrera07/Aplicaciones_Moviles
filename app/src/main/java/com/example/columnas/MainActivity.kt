
package com.example.columnas

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
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
                ViewContainer()
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun ViewContainer() {

    val context = LocalContext.current

    Scaffold(
        topBar = {
            Surface(
                color = Color.DarkGray,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Alejandro Profile",
                    color = Color.White,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(
                        horizontal = 16.dp,
                        vertical = 18.dp
                    )
                )
            }
        },

        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    Toast.makeText(
                        context,
                        "Botón flotante pulsado",
                        Toast.LENGTH_SHORT
                    ).show()
                },
                containerColor = Color(0xFF6200EE),
                contentColor = Color.White
            ) {
                Text(
                    text = "+",
                    fontSize = 28.sp
                )
            }
        },

        floatingActionButtonPosition = FabPosition.End

    ) { innerPadding ->

        Content(
            modifier = Modifier.padding(innerPadding)
        )
    }
}

@Composable
fun Content(modifier: Modifier = Modifier) {

    var counter by rememberSaveable {
        mutableStateOf(0)
    }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Blue),

        contentPadding = PaddingValues(
            bottom = 88.dp
        )
    ) {
        item {
            Image(
                painter = painterResource(
                    id = R.drawable.prueba_jp
                ),
                contentDescription = "Ajedrez",
                modifier = Modifier.fillMaxWidth()
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 25.dp,
                        top = 5.dp
                    )
            ) {
                Image(
                    painter = painterResource(
                        id = R.drawable.baseline_favorite_24
                    ),
                    contentDescription = "Like",
                    modifier = Modifier.clickable {
                        counter++
                    }
                )

                Text(
                    text = counter.toString(),
                    color = Color.White,
                    modifier = Modifier.padding(
                        start = 5.dp,
                        top = 5.dp
                    )
                )
            }

            Text(
                text = "Hola mundo",
                fontSize = 32.sp,
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )

            Text(
                text = "Aaron Antonio Acosta Ledezma",
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(25.dp, 10.dp)
            )

            Text(
                text = "Jesua Ivan Mercado Ríos",
                color = Color.White,
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
                    Text(
                        "Sigma",
                        color = Color.White
                    )

                    Text(
                        "Beta",
                        color = Color.White
                    )

                    Text(
                        "Epsilon",
                        color = Color.White
                    )

                    repeat(8) {
                        Text(
                            text = "Aaron",
                            color = Color.DarkGray
                        )
                    }
                }
            }
        }
    }
}
