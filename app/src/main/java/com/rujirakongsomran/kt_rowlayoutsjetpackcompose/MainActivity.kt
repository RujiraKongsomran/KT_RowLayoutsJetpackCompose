package com.rujirakongsomran.kt_rowlayoutsjetpackcompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        setContent {
            Column {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .border(border = BorderStroke(width = 1.dp, color = Color.Black)),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "ITEM1",
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
                    Text(
                        text = "ITEM2",
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
                }
                Spacer(modifier = Modifier.padding(20.dp))
                Row(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                        .border(border = BorderStroke(width = 1.dp, color = Color.Black)),
                        horizontalArrangement = Arrangement.Center
                    ) {
                    Text(
                        text = "ITEM2",
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                }
            }
        }
    }
}