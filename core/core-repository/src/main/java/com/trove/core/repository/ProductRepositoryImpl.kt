package com.trove.core.repository

import com.trove.core.data.pojos.ProductEntity
import com.trove.core.data.repository.ProductRepository
import com.trove.core.database.dao.ProductDao
import com.trove.core.network.TroveService
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor(
    private val productDao: ProductDao,
    private val troveService: TroveService
):ProductRepository{
    override fun getProducts(): Flow<List<ProductEntity>> {
        TODO("Not yet implemented")
    }

    override fun insertProduct(productEntity: ProductEntity) {
        TODO("Not yet implemented")
    }


}