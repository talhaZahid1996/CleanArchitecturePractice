package com.cleanarchitecture.app.presentation.coinList

import com.cleanarchitecture.app.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
