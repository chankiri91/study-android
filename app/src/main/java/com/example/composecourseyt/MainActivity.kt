package com.example.composecourseyt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import java.lang.reflect.Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = androidx.compose.ui.Modifier
                    .fillMaxHeight(0.5f)
                    .width(300.dp)
                    .background(Color.Green)
                    .border(5.dp, Color.Magenta)
                    .padding(5.dp)
                    .border(5.dp, Color.Blue)
                    .padding(5.dp)
                    .border(5.dp, Color.Red)
                    .padding(10.dp)
            ) {
                Text(text = "Hello",
                    modifier = androidx.compose.ui.Modifier
                        .offset(20.dp, 20.dp)
                        .padding(20.dp)
                        .border(5.dp, Color.Black)
                )
                Spacer(modifier = androidx.compose.ui.Modifier.height(200.dp))
                Text(text = "World")
            }
        }
    }
}