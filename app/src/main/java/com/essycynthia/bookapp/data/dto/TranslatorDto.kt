package com.essycynthia.bookapp.data.dto

import com.essycynthia.bookapp.domain.models.Translator

data class TranslatorDto(
    val birth_year: Int,
    val death_year: Int,
    val name: String
)
    fun TranslatorDto.toTranslator(): Translator {
        return Translator(name = name)
    }
