package com.krillinator.lektion_12_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.outlined.AddCircle
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.krillinator.lektion_12_compose.ui.theme.Lektion_12_ComposeTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Lektion_12_ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        ChatMessageUI()
                        ChatMessageUI()
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
fun ChatMessageUI() {

    Lektion_12_ComposeTheme {
        Row(
            Modifier.padding(16.dp),
        ) {
            MessageIcon()

            Column {
                Username(username = "Benny")
                Description()
            }
        }
    }
}

@Composable
fun Username(username: String) {

    Text(
        text = username,
        style = TextStyle(
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
    )
}

@Composable
fun Description() {

    Text(
        text = "Aspiring developer",
        color = Color.Gray,
        style = TextStyle(
            fontSize = 20.sp,
        )
    )
}

@Composable
fun MessageIcon() {

    Box(
        contentAlignment = Alignment.BottomEnd,
        modifier = Modifier.padding(horizontal = 22.dp)
    ) {

        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "",
            contentScale = ContentScale.Crop,

            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape)
        )

        Icon(
            Icons.Filled.CheckCircle,
            contentDescription = "",
            tint = Color.White,

            modifier = Modifier
                .size(30.dp)
                .clip(CircleShape)
                .border(2.dp, Color.Gray, CircleShape)
        )
    }
}


