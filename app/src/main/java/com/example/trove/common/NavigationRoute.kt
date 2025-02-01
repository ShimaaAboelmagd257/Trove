package com.example.trove.common

sealed class NavigationRoute (val route: String){
    object SplashScreen : NavigationRoute("splash")
}