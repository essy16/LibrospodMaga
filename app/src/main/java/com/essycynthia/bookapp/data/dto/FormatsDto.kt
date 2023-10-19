package com.essycynthia.bookapp.data.dto

import com.essycynthia.bookapp.domain.models.Formats
import com.google.gson.annotations.SerializedName

data class FormatsDto(
    @SerializedName("application/epub+zip")
    val application_epub_zip: String,
    @SerializedName("application/rdf+xml")
    val application_rdf_xml: String,
    @SerializedName("application/x-mobipocket-ebook")
    val application_x_mobipocket_ebook: String,
    @SerializedName("image/jpeg")
    val mimeType: String? = null,
    @SerializedName("text/html")
    val mimeTypeText: String? = null,
    @SerializedName("text/plain")
    val text_plain: String,
    @SerializedName("text/plain; charset=us-asciival ")
    val text_plain_charset_us_asciival: String,
)

fun FormatsDto.toFormats(): Formats {
    return Formats(mimeType = mimeType, mimeTypeText = mimeTypeText)
}
