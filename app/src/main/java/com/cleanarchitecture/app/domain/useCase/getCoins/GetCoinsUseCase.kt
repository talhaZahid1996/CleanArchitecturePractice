package com.cleanarchitecture.app.domain.useCase.getCoins

import com.cleanarchitecture.app.common.Resource
import com.cleanarchitecture.app.data.remote.dto.toCoin
import com.cleanarchitecture.app.domain.model.Coin
import com.cleanarchitecture.app.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    suspend operator fun invoke() : Flow<Resource<List<Coin>>> {
        return repository.getCoins()
    }

}