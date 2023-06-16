package com.essycynthia.bookapp.data.dto

import com.essycynthia.bookapp.domain.models.BooksArray

data class BooksDtoArray(
    val booksDtoArray:List<BooksDto>
)
//fun BooksDtoArray.toBooksArray():BooksArray{
//    return BooksArray(
//       booksArray = booksDtoArray
//    )
//}
