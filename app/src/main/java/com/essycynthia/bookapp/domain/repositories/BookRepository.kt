package com.essycynthia.bookapp.domain.repositories

import com.essycynthia.bookapp.common.Resource
import com.essycynthia.bookapp.data.dto.BookDetailDto
import com.essycynthia.bookapp.data.dto.BooksDto
import com.essycynthia.bookapp.data.dto.BooksDtoArray
import com.essycynthia.bookapp.domain.models.Books
import kotlinx.coroutines.flow.Flow
import retrofit2.http.Path

interface BookRepository {
    suspend fun getPopularBooks(): BooksDtoArray
    suspend fun getFrenchBooks():  BooksDtoArray
    suspend fun getChildrenBooks():  BooksDtoArray
    suspend fun getHistoryBooks():  BooksDtoArray
    suspend fun getFantasyBooks():  BooksDtoArray
    suspend fun getBiographyBooks():  BooksDtoArray
    suspend fun getTechnologyBooks():  BooksDtoArray
    suspend fun getMysteryBooks(): BooksDtoArray
    suspend fun getLawBooks():  BooksDtoArray
    suspend fun getCookingBooks():  BooksDtoArray
    suspend fun getArtBooks(): BooksDtoArray
    suspend fun getTravelBooks():  BooksDtoArray
    suspend fun getSpanishBooks():  BooksDtoArray
    suspend fun getBookDetail(id:String): BookDetailDto



}