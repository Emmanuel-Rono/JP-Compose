package com.example.compose_camp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier= Modifier
                    .background(Color.Blue)
                    .fillMaxWidth(0.7f)
                    .fillMaxHeight(0.7f)
                    .requiredWidth(300.dp)
                    .padding(top = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {
                Text("Hello World")
                Spacer(modifier = Modifier.height(5.dp)) //Takes on argument
                Text("Hello", modifier=Modifier.offset(50.dp,50.dp))
            }

        }

        }
}


