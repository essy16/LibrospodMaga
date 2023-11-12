package com.essycynthia.bookapp.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ResultEntity(

    @PrimaryKey val id: Int? = null,
    var title: String? = null,
    var authors: List<AuthorEntity>? = null,
    var subjects: ArrayList<String>? = null,
    var bookshelves: ArrayList<String>? = null,
    var languages: ArrayList<String>? = null,
    var copyright: Boolean? = null,
    var mediaType: String? = null,
    var formats: FormatsEntity? = null,
    var downloadCount: Int? = null
)
