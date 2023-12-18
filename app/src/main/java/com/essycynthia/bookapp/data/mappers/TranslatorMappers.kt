package com.essycynthia.bookapp.data.mappers

import com.essycynthia.bookapp.data.local.TranslatorEntity
import com.essycynthia.bookapp.data.remote.TranslatorDto
import com.essycynthia.bookapp.domain.models.Translator

fun TranslatorDto.toTranslatorEntity(): TranslatorEntity {
    return TranslatorEntity(
        birth_year = birth_year,
        death_year = death_year,
        name = name
    )
}
fun TranslatorEntity.toTranslator(): Translator {
    return com.essycynthia.bookapp.domain.models.Translator(
        name = name

    )
}