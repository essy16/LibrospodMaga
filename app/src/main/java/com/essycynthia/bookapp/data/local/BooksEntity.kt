package com.essycynthia.bookapp.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
data class BooksEntity(
    val count: Int?,
    val next: String?,
    val previous: String?,
    val results: List<ResultEntity>?
)

