package com.krillinator.lektion_12_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.krillinator.lektion_12_compose.ui.theme.Lektion_12_ComposeTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO - Check for

        setContent {
            Lektion_12_ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                        .fillMaxSize()
                    ) {
                        Greeting()
                        Greeting()
                    }
                }
            }
        }
    }
}

/* Components should just do ONE THING
*   SINGLE RESPONSIBILITY == Principle
*/

// Composable Functions - Capital Letter
@Composable
@Preview(showBackground = true)
fun Greeting() {
    Lektion_12_ComposeTheme {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,     // Distribution Of Space
        ) {
            MessageIcon()

            Column {
                Message(message = "Benny")
                Message(message = "Frida")
            }
        }
    }
}

@Composable
fun Message(message: String) {

    Text(text = "Hello $message")
}

@Composable
fun MessageIcon() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(30.dp)
            .clip(CircleShape)
    )

}


