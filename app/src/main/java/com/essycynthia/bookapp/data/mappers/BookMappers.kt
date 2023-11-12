package com.essycynthia.bookapp.data.mappers

import com.essycynthia.bookapp.data.local.BooksEntity
import com.essycynthia.bookapp.data.remote.BooksDto
import com.essycynthia.bookapp.domain.models.Books

fun BooksDto.toBooksEntity(): BooksEntity {
    return BooksEntity(
        count = count,
        next = next,
        previous = previous,
        results = results?.map {
            it.toResultsEntity()
        }
    )
}

fun BooksEntity.toBooks(): Books {
    return Books(
        count = count,
        next = next,
        previous = previous,
        result = results?.map {
            it.toResults()
        }
    )
}