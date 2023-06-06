package com.essycynthia.bookapp.domain.repositories

import com.essycynthia.bookapp.common.Resource
import com.essycynthia.bookapp.data.dto.BookDetailDto
import com.essycynthia.bookapp.data.dto.BooksDto
import com.essycynthia.bookapp.domain.models.Books
import kotlinx.coroutines.flow.Flow
import retrofit2.http.Path

interface BookRepository {
    suspend fun getPopularBooks(): List<BooksDto>
    suspend fun getFrenchBooks(): List<BooksDto>
    suspend fun getChildrenBooks(): List<BooksDto>
    suspend fun getHistoryBooks(): List<BooksDto>
    suspend fun getFantasyBooks(): List<BooksDto>
    suspend fun getBiographyBooks(): List<BooksDto>
    suspend fun getTechnologyBooks(): List<BooksDto>
    suspend fun getMysteryBooks():List<BooksDto>
    suspend fun getLawBooks(): List<BooksDto>
    suspend fun getCookingBooks(): List<BooksDto>
    suspend fun getArtBooks(): List<BooksDto>
    suspend fun getTravelBooks(): List<BooksDto>
    suspend fun getSpanishBooks(): List<BooksDto>
    suspend fun getBookDetail(id:String): BookDetailDto



}