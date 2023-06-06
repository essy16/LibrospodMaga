package com.essycynthia.bookapp.presentation.details

import com.essycynthia.bookapp.domain.models.BookDetail
import com.essycynthia.bookapp.domain.models.Books

data class BookDetailState (
    val isLoading: Boolean = false,
    val book: BookDetail?=null,
    val error: String = ""
)