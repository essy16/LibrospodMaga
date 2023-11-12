package com.essycynthia.bookapp.data.mappers

import com.essycynthia.bookapp.data.local.AuthorEntity
import com.essycynthia.bookapp.data.remote.AuthorDto
import com.essycynthia.bookapp.domain.models.Author

fun AuthorDto.toAuthorEntity(): AuthorEntity {
    return AuthorEntity(
        name = name,
        birthYear = birthYear,
        deathYear = deathYear
    )
}

fun AuthorEntity.toAuthors(): Author {
    return Author(
        name = name
    )
}