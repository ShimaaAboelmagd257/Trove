package com.example.trove.splash

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.trove.R


    @Composable
    fun splashView() {
        //NOTE:
        //The by keyword automatically delegates the value retrieval to the State object.
        val preLoadLottieComposition by rememberLottieComposition(
            LottieCompositionSpec.RawRes(R.raw.splashintro)
        )

        // Animate the Lottie composition
        val preloaderProgress by animateLottieCompositionAsState(
            composition = preLoadLottieComposition,
            iterations = 1
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            if (preLoadLottieComposition != null) {
                LottieAnimation(
                    composition = preLoadLottieComposition,
                    progress = preloaderProgress
                )
            }
            Text(
                text = "Trove",
                color = Color.Black,
                fontSize = 80.sp,
                modifier = Modifier.padding(horizontal = 20.dp)
                // fontFamily = FontFamily(Font(R.font.ac))
            )
        }

    }

    @Preview
    @Composable
    fun splashPrewview() {
        splashView()

    }
