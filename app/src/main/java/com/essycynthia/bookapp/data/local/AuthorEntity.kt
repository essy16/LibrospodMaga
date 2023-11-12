package com.essycynthia.bookapp.data.local

import androidx.room.Entity

@Entity
data class AuthorEntity(
   var name: String? = null,
    var birthYear: Int? = null,
    var deathYear: Int? = null
)


