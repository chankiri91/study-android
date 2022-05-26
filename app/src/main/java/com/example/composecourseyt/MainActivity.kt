package com.example.composecourseyt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CountUp()
        }
    }
}

/**
 * カウントアップボタンと現在のカウントの回数を表示するComposable関数
 * カウントアップボタンが押下されるたびにカウントの回数を1ずつ増やし、表示を更新する。
 * 内部的にMutableState<Int>を用いてカウントの回数を保持している。
 */
@Composable
fun CountUp() {
    var count: Int by remember {
        mutableStateOf(0)
    }

    Column {
        Text(
            text = "$count"
        )
        Button(
            onClick = {
                count += 1
            }
        ) {
            Text(
                text = "Count Up!"
            )
        }
    }
}