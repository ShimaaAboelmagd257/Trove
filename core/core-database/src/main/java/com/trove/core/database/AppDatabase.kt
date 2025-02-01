package com.trove.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.trove.core.database.dao.ProductDao
import com.trove.core.database.entity.ProductRoomEntity


@Database(entities = [ProductRoomEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun productDao(): ProductDao

}