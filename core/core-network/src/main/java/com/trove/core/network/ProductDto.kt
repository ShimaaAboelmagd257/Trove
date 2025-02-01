package com.trove.core.network

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ProductDto(
    val id: Int,
    val title: String,
    val price: Double,
    val description: String,
    val category: CategoryDto,
    val images: List<String>
) : Parcelable