package com.trove.core.data.pojos

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CartItemEntity(
    val id: Long = 0,
    val productId: Int,
    val quantity: Int,
    val price: Double
) : Parcelable