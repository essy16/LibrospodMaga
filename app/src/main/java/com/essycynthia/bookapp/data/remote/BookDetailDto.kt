package com.essycynthia.bookapp.data.remote

import com.essycynthia.bookapp.domain.models.BookDetail

data class BookDetailDto(
    val count: Int?,

    val next: String?,

    val previous: String?,

    val results: List<ResultDto>?
)

fun BookDetailDto.toBookDetail(): BookDetail {
    return BookDetail(
        count = count,
        next = next,
        previous = previous,
        result = results?.map {
            it.toResult()
        }
    )
}