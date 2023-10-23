package com.essycynthia.bookapp.domain.use_cases.books_cases.getbooks_cases

import com.essycynthia.bookapp.common.Resource
import com.essycynthia.bookapp.data.dto.BooksDto
import com.essycynthia.bookapp.data.dto.toBooks
import com.essycynthia.bookapp.domain.models.Books
import com.essycynthia.bookapp.domain.repositories.BookRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class BiographyBooksCases @Inject constructor(val bookRepository: BookRepository) {
     operator fun invoke(): Flow<Resource<Books>> = flow {
        try {
            emit(Resource.Loading())
            val biographyBooks=bookRepository.getBiographyBooks().toBooks()
            emit(Resource.Success(biographyBooks))

        } catch (e:HttpException) {
            emit(Resource.Error(e.localizedMessage?: "An unexpected error occurred"))

        } catch (e:IOException) {
            emit(Resource.Error("Couldn't reach server.Check your Internet Connection"))

        }
    }
}