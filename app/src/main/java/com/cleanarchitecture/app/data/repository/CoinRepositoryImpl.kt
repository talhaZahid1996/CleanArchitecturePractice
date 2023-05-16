package com.cleanarchitecture.app.data.repository

import com.cleanarchitecture.app.common.Resource
import com.cleanarchitecture.app.data.remote.CoinPaprikaApi
import com.cleanarchitecture.app.data.remote.dto.toCoin
import com.cleanarchitecture.app.data.remote.dto.toCoinDetail
import com.cleanarchitecture.app.domain.model.Coin
import com.cleanarchitecture.app.domain.model.CoinDetail
import com.cleanarchitecture.app.domain.repository.CoinRepository
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins() = flow {
        try {
            emit(Resource.Loading<List<Coin>>())
            val coins = api.getCoins().map { it.toCoin() }
            emit(Resource.Success<List<Coin>>(coins))
        } catch (e: HttpException) {
            emit(Resource.Error<List<Coin>>(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error<List<Coin>>("Couldn't reach server. Check your internet connection"))
        }
    }

    override suspend fun getCoinById(coinId: String) = flow {
        try {
            emit(Resource.Loading<CoinDetail>())
            val coin = api.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success<CoinDetail>(coin))
        } catch (e: HttpException) {
            emit(Resource.Error<CoinDetail>(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error<CoinDetail>("Couldn't reach server. Check your internet connection"))
        }
    }
}