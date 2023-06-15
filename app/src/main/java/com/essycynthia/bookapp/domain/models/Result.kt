package com.essycynthia.bookapp.domain.models

import com.essycynthia.bookapp.data.dto.FormatsDto
import com.essycynthia.bookapp.data.dto.TranslatorDto

data class Result(
    val authorDtos: Author,
    val bookshelves: String,
    val download_count: Int,
    val formatsDto: Formats,
    val idString: String,
    val languages: String,
    val media_type: String,
    val subjects: String,
    val title: String,
    val translatorDtos: Translator
)
