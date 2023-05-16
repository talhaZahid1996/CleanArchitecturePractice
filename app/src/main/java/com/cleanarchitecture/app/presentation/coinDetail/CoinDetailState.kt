package com.cleanarchitecture.app.presentation.coinDetail

import com.cleanarchitecture.app.domain.model.Coin
import com.cleanarchitecture.app.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
