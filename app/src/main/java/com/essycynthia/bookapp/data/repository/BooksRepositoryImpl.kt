package com.essycynthia.bookapp.data.repository

import com.essycynthia.bookapp.data.datasource.BooksApiService
import com.essycynthia.bookapp.data.dto.BookDetailDto
import com.essycynthia.bookapp.data.dto.BooksDto
import com.essycynthia.bookapp.domain.repositories.BookRepository
import javax.inject.Inject

class BooksRepositoryImpl @Inject constructor(private val booksApiService: BooksApiService) :
    BookRepository {
    override suspend fun getPopularBooks(): List<BooksDto> {
        return booksApiService.getPopularBooks().results
    }

    override suspend fun getFrenchBooks():  List<BooksDto> {
        return booksApiService.getFrenchBooks().results
    }

    override suspend fun getChildrenBooks():  List<BooksDto> {
        return booksApiService.getChildrenBooks().results
    }

    override suspend fun getHistoryBooks():  List<BooksDto> {
        return booksApiService.getHistoryBooks().results
    }

    override suspend fun getFantasyBooks():  List<BooksDto> {
        return booksApiService.getFantasyBooks().results
    }

    override suspend fun getBiographyBooks():  List<BooksDto> {
        return booksApiService.getBiographyBooks().results
    }

    override suspend fun getTechnologyBooks():  List<BooksDto> {
        return booksApiService.getTechnologyBooks().results
    }

    override suspend fun getMysteryBooks():  List<BooksDto> {
        return booksApiService.getMysteryBooks().results
    }

    override suspend fun getLawBooks():  List<BooksDto> {
        return booksApiService.getLawBooks().results
    }

    override suspend fun getCookingBooks():  List<BooksDto> {
        return booksApiService.getCookingBooks().results
    }

    override suspend fun getArtBooks():  List<BooksDto> {
        return booksApiService.getArtBooks().results
    }

    override suspend fun getTravelBooks(): List<BooksDto> {
        return booksApiService.getTravelBooks().results
    }

    override suspend fun getSpanishBooks():  List<BooksDto> {
        return booksApiService.getSpanishBooks().results
    }

    override suspend fun getBookDetail(id: String): BookDetailDto{
        return booksApiService.getBookDetail(id).books[0]
    }


}
