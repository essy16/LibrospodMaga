package com.essycynthia.bookapp.data.dto

import com.essycynthia.bookapp.domain.models.Author
import com.essycynthia.bookapp.domain.models.Result

data class ResultDto(
    val authorDtos: List<Author>,
    val bookshelves: List<String>,
    val copyright: Boolean,
    val download_count: Int,
    val formatsDto: FormatsDto,
    val id: Int,
    val languages: List<String>,
    val media_type: String,
    val subjects: List<String>,
    val title: String,
    val translatorDtos: List<TranslatorDto>
)
    fun ResultDto.toResult(): com.essycynthia.bookapp.domain.models.Result {
        return Result(
            authorDtos = authorDtos,
            bookshelves = bookshelves,
            formatsDto = formatsDto,
            id = id,
            languages = languages,
            media_type = media_type,
            subjects = subjects,
            title = title,
            translatorDtos = translatorDtos
        )
    }
