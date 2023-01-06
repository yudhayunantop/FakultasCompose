package com.compose.fakultascompose

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compose.fakultascompose.ui.theme.FakultasComposeTheme
import com.compose.fakultascompose.ui.theme.White

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FakultasComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainActivityScreen()
                }
            }
        }
    }
}

@Composable
fun MainActivityScreen() {
    val context = LocalContext.current as Activity
    val listfakultas = DataFakultas.listFakultas.slice(0..9)
    Scaffold(topBar = { TopBar(title = "List Fakultas UPN JATIM")}) {
        LazyColumn(modifier = Modifier.padding(it)){
            items(listfakultas){
                CardFakultas(fakultas=it){
                    val intent = Intent(context, DetailActivity::class.java)
                    intent.putExtra("name", it.name)
                    intent.putExtra("detail", it.detail)
                    intent.putExtra("photo", it.photo)
                    intent.putExtra("email", it.email)

                    context.startActivity(intent)
                }
            }
        }
    }
}

@Composable
fun TopBar(title: String) {
    val context = LocalContext.current
    TopAppBar(content = {
        Row(modifier =  Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically ) {
            Text(text = title, modifier = Modifier.padding(start = 16.dp), fontSize = 18.sp)
            IconButton(onClick = {
                val intent = Intent(context, AboutActivity::class.java)
                context.startActivity(intent)
            }) {
                Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "about_page")
            }
        }
    })
}

@Composable
fun CardFakultas(fakultas: fakultas, onClick: (fakultas)->Unit) {
    Card(modifier = Modifier
        .padding(8.dp)
        .fillMaxWidth().clickable {
          onClick(fakultas)
        },
         backgroundColor = fakultas.color) {
            Column(horizontalAlignment = Alignment.Start) {
                Image(painter = painterResource(id = fakultas.photo),
                      contentDescription = fakultas.name,
                      modifier = Modifier.fillMaxWidth().height(250.dp),
                      contentScale = ContentScale.FillBounds)
                Text(text = fakultas.name,
                     modifier = Modifier.padding(start = 8.dp),
                     color = White   )
            }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FakultasComposeTheme {
        MainActivityScreen()
    }
}