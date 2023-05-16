package com.cleanarchitecture.app.domain.repository

import com.cleanarchitecture.app.data.remote.dto.CoinDetailDto
import com.cleanarchitecture.app.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto

}