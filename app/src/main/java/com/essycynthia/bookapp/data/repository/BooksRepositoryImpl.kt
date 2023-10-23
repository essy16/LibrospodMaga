package com.essycynthia.bookapp.data.repository

import com.essycynthia.bookapp.data.datasource.BooksApiService
import com.essycynthia.bookapp.data.dto.BookDetailDto
import com.essycynthia.bookapp.data.dto.BooksDto
import com.essycynthia.bookapp.domain.repositories.BookRepository
import javax.inject.Inject

class BooksRepositoryImpl @Inject constructor(private val booksApiService: BooksApiService) :
    BookRepository {

    override suspend fun getPopularBooks(): BooksDto {
        return booksApiService.getPopularBooks()
    }

    override suspend fun getFrenchBooks():  BooksDto {
        return booksApiService.getFrenchBooks()
    }

    override suspend fun getChildrenBooks(): BooksDto {
        return booksApiService.getChildrenBooks()
    }

    override suspend fun getHistoryBooks(): BooksDto {
        return booksApiService.getHistoryBooks()
    }

    override suspend fun getFantasyBooks(): BooksDto {
        return booksApiService.getFantasyBooks()
    }

    override suspend fun getBiographyBooks(): BooksDto {
        return booksApiService.getBiographyBooks()
    }

    override suspend fun getTechnologyBooks(): BooksDto {
        return booksApiService.getTechnologyBooks()
    }

    override suspend fun getMysteryBooks(): BooksDto {
        return booksApiService.getMysteryBooks()
    }

    override suspend fun getLawBooks(): BooksDto {
        return booksApiService.getLawBooks()
    }

    override suspend fun getCookingBooks(): BooksDto {
        return booksApiService.getCookingBooks()
    }

    override suspend fun getArtBooks(): BooksDto {
        return booksApiService.getArtBooks()
    }

    override suspend fun getTravelBooks(): BooksDto {
        return booksApiService.getTravelBooks()
    }

    override suspend fun getSpanishBooks(): BooksDto {
        return booksApiService.getSpanishBooks()
    }

    override suspend fun getBookDetail(id: String): BookDetailDto{
        return booksApiService.getBookDetail(id)
    }


}
