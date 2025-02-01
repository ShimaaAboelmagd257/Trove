package com.trove.core.data.pojos

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Category(
    val id: Int = 0,
    val name: String,
    val image: String,
):Parcelable