package com.essycynthia.bookapp.data.dto

import com.essycynthia.bookapp.domain.models.Formats
import com.google.gson.annotations.SerializedName

data class FormatsDto(
    @SerializedName("application/epub+zip")
    val applicationepubzip: String,
    @SerializedName("application/octet-stream")
    val applicationOctetStream: String,
    @SerializedName("application/rdf+xml")
    val applicationRdfXml: String,
    @SerializedName("application/x-mobipocket-ebook")
    val applicationxMobipocketEbook: String,
    @SerializedName("image/jpeg")
    val imageJpeg: String,
    @SerializedName("text/html")
    val textHTML: String,
    @SerializedName("text/plain")
    val textPlain: String,
    @SerializedName("text/plain; charset=us-ascii")
    val textPlainCharsetUsAscii: String
)

fun FormatsDto.toFormats(): Formats {
    return Formats(
        image = imageJpeg
    )
}
