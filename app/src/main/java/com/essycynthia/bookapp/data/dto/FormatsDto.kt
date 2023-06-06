package com.essycynthia.bookapp.data.dto

import com.essycynthia.bookapp.domain.models.Formats

data class FormatsDto(
//
//    val application/epub+zip: String,
//    val application/octet-stream: String,
//    val application/rdf+xml: String,
//    val application/x-mobipocket-ebook: String,
    val mimeType: String = "image/jpeg",
    val mimeTypeText: String? = "text/plain"
//    val text/html: String,
//    val text/html; charset=iso-8859-1: String,
//    val text/html; charset=utf-8: String,
//    val text/plain: String,
//    val text/plain; charset=iso-8859-1: String,
//    val text/plain; charset=us-ascii: String,
//    val text/plain; charset=utf-8: String
)
    fun FormatsDto.toFormats(): Formats {
        return Formats(mimeType = mimeType, mimeTypeText = mimeTypeText)
    }
