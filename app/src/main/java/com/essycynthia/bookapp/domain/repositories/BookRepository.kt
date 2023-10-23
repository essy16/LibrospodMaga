package com.essycynthia.bookapp.domain.repositories

import com.essycynthia.bookapp.data.dto.BookDetailDto
import com.essycynthia.bookapp.data.dto.BooksDto

interface BookRepository {
    suspend fun getPopularBooks(): BooksDto
    suspend fun getFrenchBooks(): BooksDto
    suspend fun getChildrenBooks():  BooksDto
    suspend fun getHistoryBooks():  BooksDto
    suspend fun getFantasyBooks():  BooksDto
    suspend fun getBiographyBooks():  BooksDto
    suspend fun getTechnologyBooks():  BooksDto
    suspend fun getMysteryBooks(): BooksDto
    suspend fun getLawBooks():  BooksDto
    suspend fun getCookingBooks():  BooksDto
    suspend fun getArtBooks(): BooksDto
    suspend fun getTravelBooks():  BooksDto
    suspend fun getSpanishBooks():  BooksDto
    suspend fun getBookDetail(id:String): BookDetailDto



}