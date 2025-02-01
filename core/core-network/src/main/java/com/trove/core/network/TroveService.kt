package com.trove.core.network

import retrofit2.http.GET
import retrofit2.http.Query

interface TroveService {

    @GET("products")
    suspend fun getProducts(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): List<ProductDto>

    @GET("products")
    suspend fun searchProducts(
        @Query("title") title: String? = null,
        @Query("price") price: Double? = null,
        @Query("price_min") priceMin: Double? = null,
        @Query("price_max") priceMax: Double? = null,
        @Query("categoryId") categoryId: Int? = null
    ): List<ProductDto>

    @GET("categories")
    suspend fun getCategories(): List<CategoryDto>
}
