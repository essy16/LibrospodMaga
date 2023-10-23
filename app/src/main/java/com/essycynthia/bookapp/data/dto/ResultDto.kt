package com.essycynthia.bookapp.data.dto

import com.essycynthia.bookapp.domain.models.Author
import com.essycynthia.bookapp.domain.models.Formats
import com.essycynthia.bookapp.domain.models.Result
import com.google.gson.annotations.SerializedName

data class ResultDto(
    @SerializedName("id") var id: Int? = null,
    @SerializedName("title") var title: String? = null,
    @SerializedName("authors") var authors: ArrayList<Author>? = null,
    @SerializedName("subjects") var subjects: ArrayList<String>? = null,
    @SerializedName("bookshelves") var bookshelves: ArrayList<String>? = null,
    @SerializedName("languages") var languages: ArrayList<String>? = null,
    @SerializedName("copyright") var copyright: Boolean? = null,
    @SerializedName("media_type") var mediaType: String? = null,
    @SerializedName("formats") var formats: FormatsDto? = null,
    @SerializedName("download_count") var downloadCount: Int? = null
)

fun ResultDto.toResult(): Result {
    return Result(
        authors = authors,
        bookshelves = bookshelves,
        formats = formats?.toFormats(),
        id = id,
        languages = languages,
        media_type = mediaType,
        subjects = subjects,
        title = title,
        download_count = downloadCount,
        copyright = copyright
    )
}
