package com.trove.core.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products")
data class ProductRoomEntity(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val title: String,
    val price: Double,
    val description: String,
    val images: List<String>,
    val quantity: Int
)