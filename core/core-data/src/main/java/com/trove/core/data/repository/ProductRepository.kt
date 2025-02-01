package com.trove.core.data.repository

import com.trove.core.data.pojos.ProductEntity
import kotlinx.coroutines.flow.Flow

interface ProductRepository {

    fun getProducts():Flow <List<ProductEntity>>
    fun insertProduct(productEntity: ProductEntity)
}