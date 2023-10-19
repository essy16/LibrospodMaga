package com.essycynthia.bookapp.domain.models

import com.essycynthia.bookapp.data.dto.FormatsDto
import com.essycynthia.bookapp.data.dto.TranslatorDto

data class Result(
    val authors: ArrayList<Author>? = null,
    val bookshelves: ArrayList<String>? = null,
    val copyright: Boolean? = null,
    val download_count: Int? = null,
    val formats: Formats?,
    val id: Int? = null,
    val languages: ArrayList<String>? = null,
    val media_type: String? = null,
    val subjects: ArrayList<String>? = null,
    val title: String? = null,
    val translators: ArrayList<String>? = null
)

