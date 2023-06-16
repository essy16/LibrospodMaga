package com.essycynthia.bookapp.presentation.books_list

import com.essycynthia.bookapp.data.dto.BooksDtoArray
import com.essycynthia.bookapp.domain.models.Books
import com.essycynthia.bookapp.domain.models.BooksArray

data class BookListState(
    val isLoading: Boolean = false,
    val book: BooksDtoArray = BooksDtoArray(emptyList()),
    val error: String = ""
)