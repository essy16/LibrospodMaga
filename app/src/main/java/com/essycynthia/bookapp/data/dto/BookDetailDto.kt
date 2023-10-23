package com.essycynthia.bookapp.data.dto

import com.essycynthia.bookapp.domain.models.BookDetail
import com.essycynthia.bookapp.domain.models.Result

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