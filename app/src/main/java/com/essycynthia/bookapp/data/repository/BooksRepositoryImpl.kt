package com.essycynthia.bookapp.data.repository

import com.essycynthia.bookapp.data.datasource.BooksApiService
import com.essycynthia.bookapp.data.dto.BookDetailDto
import com.essycynthia.bookapp.data.dto.BooksDto
import com.essycynthia.bookapp.data.dto.BooksDtoArray
import com.essycynthia.bookapp.domain.repositories.BookRepository
import javax.inject.Inject

class BooksRepositoryImpl @Inject constructor(private val booksApiService: BooksApiService) :
    BookRepository {
    override suspend fun getPopularBooks(): BooksDtoArray {
        return booksApiService.getPopularBooks()
    }

    override suspend fun getFrenchBooks():  BooksDtoArray {
        return booksApiService.getFrenchBooks()
    }

    override suspend fun getChildrenBooks():  BooksDtoArray {
        return booksApiService.getChildrenBooks()
    }

    override suspend fun getHistoryBooks():  BooksDtoArray {
        return booksApiService.getHistoryBooks()
    }

    override suspend fun getFantasyBooks():  BooksDtoArray {
        return booksApiService.getFantasyBooks()
    }

    override suspend fun getBiographyBooks():  BooksDtoArray {
        return booksApiService.getBiographyBooks()
    }

    override suspend fun getTechnologyBooks():  BooksDtoArray {
        return booksApiService.getTechnologyBooks()
    }

    override suspend fun getMysteryBooks():  BooksDtoArray {
        return booksApiService.getMysteryBooks()
    }

    override suspend fun getLawBooks():  BooksDtoArray {
        return booksApiService.getLawBooks()
    }

    override suspend fun getCookingBooks():  BooksDtoArray {
        return booksApiService.getCookingBooks()
    }

    override suspend fun getArtBooks():  BooksDtoArray {
        return booksApiService.getArtBooks()
    }

    override suspend fun getTravelBooks(): BooksDtoArray {
        return booksApiService.getTravelBooks()
    }

    override suspend fun getSpanishBooks():  BooksDtoArray {
        return booksApiService.getSpanishBooks()
    }

    override suspend fun getBookDetail(id: String): BookDetailDto {
        return booksApiService.getBookDetail("id")
    }


}
