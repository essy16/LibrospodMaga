package com.essycynthia.bookapp.data.dto

import com.essycynthia.bookapp.domain.models.Books
import com.essycynthia.bookapp.domain.models.ResultArray

data class BooksDto(
    val count: Int?,
    val next: String?,
    val previous: Any?,
    val resultDto: ResultArray?
)
    fun BooksDto.toBooks(): Books {
        return Books(
            count = count,
            next = next,
            previous = previous,
            resultDtos = resultDto

        )
    }
