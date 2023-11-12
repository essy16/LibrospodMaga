package com.essycynthia.bookapp.data.remote

import com.essycynthia.bookapp.domain.models.Author
import com.google.gson.annotations.SerializedName

data class AuthorDto(
    @SerializedName("name") var name: String? = null,
    @SerializedName("birth_year") var birthYear: Int? = null,
    @SerializedName("death_year") var deathYear: Int? = null
)

fun AuthorDto.toAuthor(): Author {
    return Author(name = name)
}
