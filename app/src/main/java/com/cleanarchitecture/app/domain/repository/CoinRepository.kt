package com.cleanarchitecture.app.domain.repository

import com.cleanarchitecture.app.common.Resource
import com.cleanarchitecture.app.domain.model.Coin
import com.cleanarchitecture.app.domain.model.CoinDetail
import kotlinx.coroutines.flow.Flow

interface CoinRepository {

    suspend fun getCoins(): Flow<Resource<List<Coin>>>

    suspend fun getCoinById(coinId: String): Flow<Resource<CoinDetail>>

}