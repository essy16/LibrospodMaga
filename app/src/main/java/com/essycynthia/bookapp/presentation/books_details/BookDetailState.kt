package com.essycynthia.bookapp.presentation.books_details

import com.essycynthia.bookapp.domain.models.BookDetail
import com.essycynthia.bookapp.domain.models.Result

data class BookDetailState (
    val isLoading: Boolean = false,
    val book: BookDetail? = null,
    val error: String = ""
)