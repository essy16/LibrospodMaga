package com.essycynthia.bookapp.data.dto.books

import com.essycynthia.bookapp.data.dto.books.Result
import com.essycynthia.bookapp.domain.models.ResultArray

data class Result(
    val authors: List<Author>,
    val bookshelves: List<String>,
    val copyright: Boolean,
    val download_count: Int,
    val formats: Formats,
    val id: Int,
    val languages: List<String>,
    val media_type: String,
    val subjects: List<String>,
    val title: String,
    val translators: List<Any>
)