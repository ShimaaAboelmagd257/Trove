package com.trove.core.network

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CategoryDto (
    val id: Int,
    val name: String,
    val image: String
    ):Parcelable