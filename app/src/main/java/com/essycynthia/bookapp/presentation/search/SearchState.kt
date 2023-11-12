package com.essycynthia.bookapp.presentation.search

import com.essycynthia.bookapp.domain.models.BookDetail
import com.essycynthia.bookapp.domain.models.Books
import com.essycynthia.bookapp.domain.models.Result

data class SearchState (
    val isLoading: Boolean = false,
    val books: List<Result> = emptyList(),
    val error: String = ""
)