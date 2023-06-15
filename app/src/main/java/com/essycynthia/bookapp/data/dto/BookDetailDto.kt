package com.essycynthia.bookapp.data.dto

import com.essycynthia.bookapp.domain.models.BookDetail
import com.essycynthia.bookapp.domain.models.Result

data class BookDetailDto(
    val count: Int,
    val next: Any,
    val previous: Any,
    val results: Result
)

fun BookDetailDto.toBookDetail(): BookDetail {
    return BookDetail(
        count = count,
        results = results
    )
}