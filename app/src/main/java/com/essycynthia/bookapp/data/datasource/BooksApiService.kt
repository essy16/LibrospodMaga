package com.essycynthia.bookapp.data.datasource

import com.essycynthia.bookapp.data.dto.BookDetailDto
import com.essycynthia.bookapp.data.dto.BooksDto
import com.essycynthia.bookapp.data.dto.BooksDtoArray
import com.essycynthia.bookapp.domain.models.Books
import retrofit2.http.GET
import retrofit2.http.Path

interface BooksApiService {
    @GET("/books?ids=1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100")
    suspend fun getPopularBooks(): BooksDtoArray

    @GET("/books?languages=fr")
    suspend fun getFrenchBooks():  BooksDtoArray

    @GET("/books?languages=es")
    suspend fun getSpanishBooks():  BooksDtoArray

    @GET("/books?topic=Children")
    suspend fun getChildrenBooks():  BooksDtoArray

    @GET("/books?topic=History")

    suspend fun getHistoryBooks():  BooksDtoArray

    @GET("/books?topic=Fantasy")

    suspend fun getFantasyBooks(): BooksDtoArray

    @GET("/books?topic=Biography")

    suspend fun getBiographyBooks():  BooksDtoArray

    @GET("/books?topic=Technology")

    suspend fun getTechnologyBooks():  BooksDtoArray

    @GET("/books?topic=Mystery")

    suspend fun getMysteryBooks():  BooksDtoArray

    @GET("/books?topic=Law")

    suspend fun getLawBooks():  BooksDtoArray

    @GET("/books?topic=Cooking")

    suspend fun getCookingBooks():  BooksDtoArray

    @GET("/books?topic=Art")

    suspend fun getArtBooks():  BooksDtoArray

    @GET("/books?topic=TRAVEL")
    suspend fun getTravelBooks():  BooksDtoArray

    @GET("/books?ids={id}")
    suspend fun getBookDetail(@Path("id")id:String): BookDetailDto


}