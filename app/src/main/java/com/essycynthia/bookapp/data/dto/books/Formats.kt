package com.essycynthia.bookapp.data.dto.books

import com.google.gson.annotations.SerializedName

data class Formats(
    @SerializedName("application/epub+zip")
    val application_epub_zip : String,
    @SerializedName("application/rdf+xml")
    val application_rdf_xml : String,
    @SerializedName("application/x-mobipocket-ebook")
    val application_x_mobipocket_ebook : String,
    @SerializedName("image/jpeg")
    val image_jpeg : String,
    @SerializedName("text/html")
    val text_html : String,
    @SerializedName("text/plain")
    val text_plain : String,
    @SerializedName("text/plain; charset=us-asciival ")
    val text_plain_charset_us_asciival : String,
)