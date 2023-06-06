package com.essycynthia.bookapp.data.dto

import com.essycynthia.bookapp.domain.models.Author

data class AuthorDto(
    val birth_year: Int,
    val death_year: Int,
    val name: String
)
    fun AuthorDto.toAuthor():Author{
        return Author(name = name)
    }
