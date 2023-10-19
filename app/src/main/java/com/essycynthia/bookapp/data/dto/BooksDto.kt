package com.essycynthia.bookapp.data.dto

import com.essycynthia.bookapp.domain.models.Books
import com.essycynthia.bookapp.domain.models.Result
import com.google.gson.annotations.SerializedName

data class BooksDto(
    @SerializedName("count") var count: Int? = null,
    @SerializedName("next") var next: String? = null,
    @SerializedName("previous") var previous: String? = null,
    @SerializedName("results") var results: ArrayList<Result> = arrayListOf()

)

fun BooksDto.toBooks(): Books {
    return Books(
        count = count,
        next = next,
        previous = previous,
        resultDtos = results

    )
}
