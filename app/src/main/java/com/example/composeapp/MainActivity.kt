package com.example.composeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign.Companion.Justify
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapp.ui.theme.ComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    /*Article(
                        modifier = Modifier.padding(innerPadding)
                    )
                    TaskManager(
                        modifier = Modifier.padding(innerPadding)
                    )*/
                    Quadrants(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ArticleImage(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Image(painter = image, contentDescription = "Background")
}

@Composable
fun TaskImage(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.ic_task_completed)
    Image(painter = image, contentDescription = "Task completed")
}

@Composable
fun Article(modifier: Modifier = Modifier) {
    Column {
        ArticleImage(Modifier.fillMaxWidth())
        Text(
            text = "Jetpack Compose tutorial",
            modifier = modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
            modifier = modifier.padding(16.dp),
            textAlign = Justify
        )
        Text(
            text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",
            modifier = modifier.padding(16.dp),
            textAlign = Justify
        )
    }

}

@Composable
fun TaskManager(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        TaskImage()
        Text(
            text = "All tasks completed",
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(24.dp, 8.dp))
        Text(
            text = "Nice work!",
            fontSize = 16.sp)
    }
}

@Composable
fun Quadrants(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize()) {
        Row {
            Column(modifier = Modifier.background(Color(0xFFEADDFF))) {
                Text(
                    text = "Text composable\n",
                    fontWeight = FontWeight.Bold,
                    modifier = modifier.padding(0.dp, 16.dp)
                )
                Text(
                    text = "Displays text and follows the recommended Material Design guidelines.\n"
                )
            }
            Column(modifier = Modifier.background(Color(0xFFD0BCFF))) {
                Text(
                    text = "Image composable\n",
                    fontWeight = FontWeight.Bold,
                    modifier = modifier.padding(0.dp, 16.dp)
                )
                Text(
                    text = "Creates a composable that lays out and draws a given Painter class object."
                )
            }
        }
        Row {
            Column(modifier = Modifier.background(Color(0xFFB69DF8))) {
                Text(
                    text = "Row composable",
                    fontWeight = FontWeight.Bold,
                    modifier = modifier.padding(0.dp, 16.dp)
                )
                Text(
                    text = "A layout composable that places its children in a horizontal sequence."
                )
            }
            Column(modifier = Modifier.background(Color(0xFFF6EDFF))) {
                Text(
                    text = "Column composable",
                    fontWeight = FontWeight.Bold,
                    modifier = modifier.padding(0.dp, 16.dp)
                )
                Text(
                    text = "A layout composable that places its children in a vertical sequence."
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ArticlePreview() {
    ComposeAppTheme {
        Article()
    }
}