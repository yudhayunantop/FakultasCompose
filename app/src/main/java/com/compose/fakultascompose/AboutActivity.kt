package com.compose.fakultascompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compose.fakultascompose.ui.theme.FakultasComposeTheme

class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FakultasComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    AboutActivityScreen()
                }
            }
        }
    }
}

@Composable
fun AboutActivityScreen() {
    Scaffold(topBar = {
        TopAppBar(title = {
            Text(text = "About Me")
        })
    }) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Image(painter = painterResource(id = R.drawable.profil),
                contentDescription = "my_profil",modifier = Modifier.fillMaxWidth().height(375.dp),
                contentScale = ContentScale.FillBounds)
            Text(text = "Yudha Yunanto Putra", modifier = Modifier.padding(start = 16.dp, top = 24.dp))
            Text(text = "yudha.yunanto.2010@gmail.com", modifier = Modifier.padding(start = 16.dp), fontSize = 12.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    FakultasComposeTheme {
        AboutActivityScreen()
    }
}