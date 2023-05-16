package com.cleanarchitecture.app.data.remote

import com.cleanarchitecture.app.data.remote.dto.CoinDetailDto
import com.cleanarchitecture.app.data.remote.dto.CoinDto
import com.cleanarchitecture.app.domain.model.Coin
import com.cleanarchitecture.app.domain.model.CoinDetail
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailDto

}