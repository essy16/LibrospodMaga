package com.essycynthia.bookapp.di

import com.essycynthia.bookapp.common.Constants
import com.essycynthia.bookapp.data.datasource.BooksApiService
import com.essycynthia.bookapp.data.repository.BooksRepositoryImpl
import com.essycynthia.bookapp.domain.repositories.BookRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideBooksApi():BooksApiService{
        return Retrofit.Builder()
            .baseUrl(Constants.books_Base_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(BooksApiService::class.java)

    }

    @Provides
    @Singleton
    fun provideRepository(apiService: BooksApiService):BookRepository{
        return BooksRepositoryImpl(apiService)

    }
}