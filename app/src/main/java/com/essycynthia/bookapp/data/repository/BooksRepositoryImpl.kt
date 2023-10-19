package com.essycynthia.bookapp.data.repository

import com.essycynthia.bookapp.data.datasource.BooksApiService
import com.essycynthia.bookapp.data.dto.BookDetailDto
import com.essycynthia.bookapp.data.dto.BooksDto
import com.essycynthia.bookapp.domain.repositories.BookRepository
import javax.inject.Inject

class BooksRepositoryImpl @Inject constructor(private val booksApiService: BooksApiService) :
    BookRepository {
    override suspend fun getPopularBooks(): List<BooksDto> {
        return booksApiService.getPopularBooks().books
    }

    override suspend fun getFrenchBooks():  List<BooksDto> {
        return booksApiService.getFrenchBooks().books
    }

    override suspend fun getChildrenBooks():  List<BooksDto> {
        return booksApiService.getChildrenBooks().books
    }

    override suspend fun getHistoryBooks():  List<BooksDto> {
        return booksApiService.getHistoryBooks().books
    }

    override suspend fun getFantasyBooks():  List<BooksDto> {
        return booksApiService.getFantasyBooks().books
    }

    override suspend fun getBiographyBooks():  List<BooksDto> {
        return booksApiService.getBiographyBooks().books
    }

    override suspend fun getTechnologyBooks():  List<BooksDto> {
        return booksApiService.getTechnologyBooks().books
    }

    override suspend fun getMysteryBooks():  List<BooksDto> {
        return booksApiService.getMysteryBooks().books
    }

    override suspend fun getLawBooks():  List<BooksDto> {
        return booksApiService.getLawBooks().books
    }

    override suspend fun getCookingBooks():  List<BooksDto> {
        return booksApiService.getCookingBooks().books
    }

    override suspend fun getArtBooks():  List<BooksDto> {
        return booksApiService.getArtBooks().books
    }

    override suspend fun getTravelBooks(): List<BooksDto> {
        return booksApiService.getTravelBooks().books
    }

    override suspend fun getSpanishBooks():  List<BooksDto> {
        return booksApiService.getSpanishBooks().books
    }

    override suspend fun getBookDetail(id: String): BookDetailDto{
        return booksApiService.getBookDetail(id).books[0]
    }


}
