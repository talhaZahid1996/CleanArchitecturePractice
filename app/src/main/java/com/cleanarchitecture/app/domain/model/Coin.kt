package com.cleanarchitecture.app.domain.model

import com.google.gson.annotations.SerializedName

data class Coin(
    val id: String? = null,
    val isActive: Boolean,
    val name: String? = null,
    val rank: Int? = null,
    val symbol: String? = null
)
