package com.example.trove.common

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.trove.splash.splashView


    @Composable
    fun appNavigation() {
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = NavigationRoute.SplashScreen.route){
            composable(NavigationRoute.SplashScreen.route){
                splashView()
            }
        }

    }
