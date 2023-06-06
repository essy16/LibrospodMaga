package com.essycynthia.bookapp.data.dto

import com.essycynthia.bookapp.domain.models.Books

data class BooksDto(
    val count: Int?,
    val next: String?,
    val previous: Any?,
    val resultDto: List<com.essycynthia.bookapp.domain.models.Result>?
)
    fun BooksDto.toBooks(): Books {
        return Books(
            count = count,
            next = next,
            previous = previous,
            resultDtos = resultDto

        )
    }
