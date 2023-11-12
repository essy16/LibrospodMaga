package com.essycynthia.bookapp.data.local

import androidx.room.Entity

@Entity
data class TranslatorEntity(
    val birth_year: Int? = null,
    val death_year: Int? = null,
    val name: String? = null
)
