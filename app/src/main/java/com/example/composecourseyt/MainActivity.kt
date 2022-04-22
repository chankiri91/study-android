package com.example.composecourseyt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composecourseyt.ui.theme.ComposeCourseYTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Command + P で何が入るやつか見れる
            Row(
                modifier = Modifier
                    .width(300.dp)
                    .height(300.dp)
                    // .fillMaxSize()
                    .background(Color.Yellow),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
                /* horizontalAllignment = Allignment.Alignment.CenterVertically
                verticalArrangement = Arrangement.SpaceAround */
            ) {
                Text(text = "Hello")
                Text(text = "World")
                Text(text = "hello")
            }
        }
    }
}