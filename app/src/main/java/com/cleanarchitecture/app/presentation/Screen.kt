package com.cleanarchitecture.app.presentation

sealed class Screen(val route: String){
    object CoinListScreen: Screen("coinListScreen")
    object CoinDetailScreen: Screen("coinDetailScreen")
}
