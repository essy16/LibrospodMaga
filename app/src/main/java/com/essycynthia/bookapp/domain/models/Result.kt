package com.essycynthia.bookapp.domain.models

data class Result(
    val authors: List<Author>? = null,
    val bookshelves: List<String>? = null,
    val copyright: Boolean? = null,
    val download_count: Int? = null,
    val formats: Formats?,
    val id: Int? = null,
    val languages: List<String>? = null,
    val media_type: String? = null,
    val subjects: List<String>? = null,
    val title: String? = null,
//    val translators: List<String>? = null
)

