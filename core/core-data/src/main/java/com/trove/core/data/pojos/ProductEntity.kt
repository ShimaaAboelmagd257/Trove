package com.trove.core.data.pojos

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
@Parcelize
data class ProductEntity (
    val id: Int = 0,
    val title: String,
    val price: Double,
    val description: String,
    val images: List<String>,
    val quantity: Int
): Parcelable