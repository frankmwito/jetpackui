package com.example.jetpckui

import android.os.Bundle
import android.view.textclassifier.ConversationActions
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpckui.ui.theme.JetpckuiTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      JetpckuiTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
          Greeting(Message("Franklyne", "Jetpack Compose"))
        }
      }
    }
  }
}
data class Message(val author: String, val body: String)

@Composable
fun Greeting(msg:Message) {
  Row (modifier = Modifier.padding(all = 8.dp)){
    Image(
      painter = painterResource(id =R.drawable.download ),
      contentDescription = "contact profile picture",
    modifier = Modifier
      .size(40.dp)
      .clip(CircleShape)
    )
    Spacer(modifier = Modifier.width(8.dp))
  }
    Column {
      Text(text = msg.author)
      Spacer(modifier = Modifier.height(4.dp))
      Text(text = msg.body)
    }
}

@Preview
@Composable
fun PreviewGreeting() {
  Greeting(
    msg = Message("Franklyne", "Hey, take a look at jetpack compose, it`s great!")
  )
}

