package com.essycynthia.bookapp.domain.use_cases.books_cases.getbooksdetails_cases

import com.essycynthia.bookapp.common.Resource
import com.essycynthia.bookapp.data.remote.toBookDetail
import com.essycynthia.bookapp.domain.models.BookDetail
import com.essycynthia.bookapp.domain.repositories.BookRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class BookDetailCase @Inject constructor(val bookRepository: BookRepository) {
     operator fun invoke(id:String): Flow<Resource<BookDetail>> = flow {
        try {
            emit(Resource.Loading())
            val book=bookRepository.getBookDetail(id).toBookDetail()
            emit(Resource.Success(book))

        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage?: "An unexpected error occurred"))

        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server.Check your Internet Connection"))

        }
    }
}