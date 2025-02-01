package com.example.trove

import android.content.Context
import androidx.room.Room
import com.trove.core.data.repository.ProductRepository
import com.trove.core.database.AppDatabase
import com.trove.core.database.dao.ProductDao
import com.trove.core.network.TroveService
import com.trove.core.repository.ProductRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule{

    @Provides
    @Singleton

    fun provideDatabase(@ApplicationContext contex: Context): AppDatabase {
        return Room.databaseBuilder(
            contex,
            AppDatabase::class.java,
            "trove_database"
        ).build()
    }

    @Provides
    fun provideProductDao(database: AppDatabase):ProductDao{
        return database.productDao()
    }

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://api.escuelajs.co/api/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    
    @Provides
    fun provideTroveService(retrofit : Retrofit):TroveService{
        return retrofit.create(TroveService::class.java)
    }
    
    
    @Provides
    @Singleton
    fun provideProductRepository(
        productDao: ProductDao,
        troveService: TroveService
    ):ProductRepository{
        return ProductRepositoryImpl(productDao,troveService)
    }

}