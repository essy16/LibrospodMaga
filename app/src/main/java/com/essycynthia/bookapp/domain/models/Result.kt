package com.essycynthia.bookapp.domain.models

import com.essycynthia.bookapp.data.dto.FormatsDto
import com.essycynthia.bookapp.data.dto.TranslatorDto

data class Result(
    val authorDtos: List<Author>,
    val bookshelves: List<String>,
//    val download_count: Int,
    val formatsDto: FormatsDto,
    val id: Int,
    val languages: List<String>,
    val media_type: String,
    val subjects: List<String>,
    val title: String,
    val translatorDtos: List<Translator>
)
