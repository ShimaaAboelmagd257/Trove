package com.trove.core.data.pojos

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class OrderItemEntity(
    val id: Long = 0,
    val orderId: Long,
    val productId: Long,
    val quantity: Int,
    val price: Double
) : Parcelable