package com.essycynthia.bookapp.presentation.books_list

import com.essycynthia.bookapp.domain.models.Books
import com.essycynthia.bookapp.domain.models.Result

data class BookListState(
    val isLoading: Boolean = false,
    val popularBookS: List<Result> = emptyList(),
    val artBookS: List<Result> = emptyList(),
    val biographyBookS: List<Result> = emptyList(),
    val childrenBookS: List<Result> = emptyList(),
    val fantasyBookS: List<Result> = emptyList(),
    val frenchBookS: List<Result> = emptyList(),
    val cookingBooks: List<Result> = emptyList(),
    val historyBookS: List<Result> = emptyList(),
    val lawBookS: List<Result> = emptyList(),
    val mysteryBookS: List<Result> = emptyList(),
    val spanishBookS: List<Result> = emptyList(),
    val technologyBookS: List<Result> = emptyList(),
    val travelBookS: List<Result> = emptyList(),
    val error: String = ""
)