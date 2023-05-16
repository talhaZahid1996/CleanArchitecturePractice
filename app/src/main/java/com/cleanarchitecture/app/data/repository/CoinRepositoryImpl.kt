package com.cleanarchitecture.app.data.repository

import com.cleanarchitecture.app.data.remote.CoinPaprikaApi
import com.cleanarchitecture.app.data.remote.dto.CoinDetailDto
import com.cleanarchitecture.app.data.remote.dto.CoinDto
import com.cleanarchitecture.app.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}