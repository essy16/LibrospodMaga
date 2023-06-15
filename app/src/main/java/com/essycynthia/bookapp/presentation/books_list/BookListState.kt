package com.essycynthia.bookapp.presentation.books_list

import com.essycynthia.bookapp.domain.models.Books

data class BookListState(
    val isLoading: Boolean = false,
    val book: List<Books> = emptyList(),
    val error: String = ""
)