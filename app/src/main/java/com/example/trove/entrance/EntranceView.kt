package com.example.trove.entrance

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.trove.R
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview

class EntranceView {
    @Composable
    fun entranceView() {
        Box {

            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Image(painter = painterResource(id = R.drawable.bag_logo_intrance),
                    contentDescription = null,
                    modifier = Modifier.fillMaxWidth()
                )
                Text(
                    text = "Already have account ?",
                    color = Color.DarkGray,
                  //  fontSize = 16.dp,
                    //modifier = Modifier.padding(bottom = 8.dp)
                )
                Button(onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding( 8.dp)
                        .width(250.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black)
                ) {
                    Text(text = "Sign in",
                        color = Color.White
                    )

                }
                Button(onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(8.dp)
                        .width(250.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black)
                ) {
                    Text(text = "Get started",
                        color = Color.White
                    )
                }

                
            }
        }

   

    }
    @Preview
    @Composable
    fun enteranceScreen() {
        entranceView()

    }
}