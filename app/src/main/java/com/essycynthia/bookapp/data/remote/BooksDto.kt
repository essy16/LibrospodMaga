package com.essycynthia.bookapp.data.remote

import com.essycynthia.bookapp.domain.models.Books

data class BooksDto(


    val count: Int?,

    val next: String?,

    val previous: String?,

    val results: List<ResultDto>?

)

fun BooksDto.toBooks(): Books {
    return Books(

        count = count,
        next = next,
        previous = previous,
        result = results?.map {
            it.toResult()
        }
    )
}
