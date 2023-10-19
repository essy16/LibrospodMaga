package com.essycynthia.bookapp.data.dto

import com.essycynthia.bookapp.domain.models.BookDetail
import com.essycynthia.bookapp.domain.models.Result

data class BookDetailDto(
    val count: Int? = null,
    val next: Any? = null,
    val previous: Any? = null,
    val results: Result? = null
)

fun BookDetailDto.toBookDetail(): BookDetail {
    return BookDetail(
        count = count,
        results = results
    )
}