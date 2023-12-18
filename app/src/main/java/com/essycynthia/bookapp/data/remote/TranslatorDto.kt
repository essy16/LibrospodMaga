package com.essycynthia.bookapp.data.remote

import com.essycynthia.bookapp.domain.models.Translator

data class TranslatorDto(
    val birth_year: Int? = null,
    val death_year: Int? = null,
    val name: String? = null
)

fun TranslatorDto.toTranslator(): Translator {
    return Translator(name = name)
}
