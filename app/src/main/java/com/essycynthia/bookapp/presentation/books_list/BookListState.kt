package com.essycynthia.bookapp.presentation.books_list

import com.essycynthia.bookapp.data.dto.BooksDto
import com.essycynthia.bookapp.domain.models.Books
import com.essycynthia.bookapp.domain.models.Result

data class BookListState(
    val isLoading: Boolean = false,
    val book: List<Result> = emptyList(),
    val error: String = ""
)