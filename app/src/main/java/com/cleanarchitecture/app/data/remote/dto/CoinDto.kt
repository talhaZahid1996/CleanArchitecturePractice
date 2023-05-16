package com.cleanarchitecture.app.data.remote.dto

import com.cleanarchitecture.app.domain.model.Coin
import com.google.gson.annotations.SerializedName

data class CoinDto(

    @field:SerializedName("symbol")
    val symbol: String? = null,

    @field:SerializedName("is_active")
    val isActive: Boolean,

    @field:SerializedName("is_new")
    val isNew: Boolean? = null,

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("rank")
    val rank: Int? = null,

    @field:SerializedName("id")
    val id: String? = null,

    @field:SerializedName("type")
    val type: String? = null
)

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        isActive = isActive,
        name = name,
        rank = rank,
        symbol = symbol
    )
}
