package com.essycynthia.bookapp.data.dto

import com.essycynthia.bookapp.domain.models.Books
import com.essycynthia.bookapp.domain.models.Result
import com.google.gson.annotations.SerializedName

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
