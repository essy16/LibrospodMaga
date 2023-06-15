package com.essycynthia.bookapp.data.dto

import com.essycynthia.bookapp.domain.models.Author
import com.essycynthia.bookapp.domain.models.Formats
import com.essycynthia.bookapp.domain.models.Result
import com.essycynthia.bookapp.domain.models.Translator

data class ResultDto(
    val authorDtos: Author,
    val bookshelves: String,
    val copyright: Boolean,
    val download_count: Int,
    val formatsDto: Formats,
    val id: Int,
    val languages: String,
    val media_type: String,
    val subjects: String,
    val title: String,
    val translatorDtos: Translator
){
    val idString: String
        get() = id.toString()
}

fun ResultDto.toResult(): com.essycynthia.bookapp.domain.models.Result {
    return Result(
        authorDtos = authorDtos,
        bookshelves = bookshelves,
        formatsDto = formatsDto,
        idString = idString,
        languages = languages,
        media_type = media_type,
        subjects = subjects,
        title = title,
        translatorDtos = translatorDtos,
        download_count = download_count
    )
}
