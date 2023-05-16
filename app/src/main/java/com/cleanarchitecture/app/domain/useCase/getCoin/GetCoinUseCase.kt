package com.cleanarchitecture.app.domain.useCase.getCoin

import com.cleanarchitecture.app.common.Resource
import com.cleanarchitecture.app.domain.model.CoinDetail
import com.cleanarchitecture.app.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    suspend operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> {
        return repository.getCoinById(coinId)
    }
}