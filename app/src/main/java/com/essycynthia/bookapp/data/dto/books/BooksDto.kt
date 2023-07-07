package com.essycynthia.bookapp.data.dto.books

import com.essycynthia.bookapp.data.dto.BooksDto
import com.essycynthia.bookapp.data.dto.BooksDtoArray
import com.essycynthia.bookapp.domain.models.ResultArray

data class FixBooksDto(
    val count: Int,
    val next: Any?,
    val previous: Any?,
    val results: List<Result>
)