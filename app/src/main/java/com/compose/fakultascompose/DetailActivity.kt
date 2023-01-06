package com.compose.fakultascompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compose.fakultascompose.ui.theme.FakultasComposeTheme

class DetailActivity : ComponentActivity() {
    lateinit var name : String
    lateinit var detail : String
    private var photo : Int = 0
    lateinit var email : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        name = intent.getStringExtra("name").toString()
        detail = intent.getStringExtra("detail").toString()
        photo = intent.getIntExtra("photo", 0)
        email = intent.getStringExtra("email").toString()

        setContent {
            FakultasComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    DetailActivityScreen(
                        name = name,
                        detail=detail,
                        photo = photo,
                        email = email)
                }
            }
        }
    }
}

@Composable
fun DetailActivityScreen(name : String, detail: String, photo: Int, email: String) {
    Scaffold(topBar = {
        TopAppBar(title = {
            Text(text = name)
        })
    }) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Image(painter = painterResource(id = photo),
                    contentDescription = name,modifier = Modifier.fillMaxWidth().height(250.dp),
                    contentScale = ContentScale.FillBounds)
            Text(text = name, modifier = Modifier.padding(start = 16.dp, top = 24.dp))
            Text(text = email, modifier = Modifier.padding(start = 16.dp), fontSize = 12.sp)
            Text(text = detail, modifier = Modifier.padding(start = 24.dp, top = 24.dp, end = 24.dp).fillMaxWidth())
        }
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    FakultasComposeTheme {
        DetailActivityScreen(name = "ini nama", detail = "ini detail", photo = R.drawable.fik, email = "ini email")
    }
}