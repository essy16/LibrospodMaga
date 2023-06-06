package com.essycynthia.bookapp.data.repository

import com.essycynthia.bookapp.data.datasource.BooksApiService
import com.essycynthia.bookapp.data.dto.BookDetailDto
import com.essycynthia.bookapp.data.dto.BooksDto
import com.essycynthia.bookapp.domain.repositories.BookRepository
import javax.inject.Inject

class BooksRepositoryImpl @Inject constructor(private val booksApiService: BooksApiService) :
    BookRepository {
    override suspend fun getPopularBooks(): List<BooksDto> {
        return booksApiService.getPopularBooks()
    }

    override suspend fun getFrenchBooks(): List<BooksDto> {
        return booksApiService.getFrenchBooks()
    }

    override suspend fun getChildrenBooks(): List<BooksDto> {
        return booksApiService.getChildrenBooks()
    }

    override suspend fun getHistoryBooks(): List<BooksDto> {
        return booksApiService.getHistoryBooks()
    }

    override suspend fun getFantasyBooks(): List<BooksDto> {
        return booksApiService.getFantasyBooks()
    }

    override suspend fun getBiographyBooks(): List<BooksDto> {
        return booksApiService.getBiographyBooks()
    }

    override suspend fun getTechnologyBooks(): List<BooksDto> {
        return booksApiService.getTechnologyBooks()
    }

    override suspend fun getMysteryBooks(): List<BooksDto> {
        return booksApiService.getMysteryBooks()
    }

    override suspend fun getLawBooks(): List<BooksDto> {
        return booksApiService.getLawBooks()
    }

    override suspend fun getCookingBooks(): List<BooksDto> {
        return booksApiService.getCookingBooks()
    }

    override suspend fun getArtBooks(): List<BooksDto> {
        return booksApiService.getArtBooks()
    }

    override suspend fun getTravelBooks(): List<BooksDto> {
        return booksApiService.getTravelBooks()
    }

    override suspend fun getSpanishBooks(): List<BooksDto> {
        return booksApiService.getSpanishBooks()
    }

    override suspend fun getBookDetail(id: Int): BookDetailDto {
        return booksApiService.getBookDetail(id)
    }


}
