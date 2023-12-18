package com.essycynthia.bookapp.data.mappers

import com.essycynthia.bookapp.data.local.FormatsEntity
import com.essycynthia.bookapp.data.remote.FormatsDto
import com.essycynthia.bookapp.domain.models.Formats

fun FormatsDto.toFormatsEntity(): FormatsEntity {
    return FormatsEntity(
        applicationepubzip = applicationepubzip,
        applicationOctetStream = applicationOctetStream,
        applicationRdfXml = applicationRdfXml,
        applicationxMobipocketEbook = applicationxMobipocketEbook,
        imageJpeg = imageJpeg,
        textHTML = textHTML,
        textPlain = textPlain,
        textPlainCharsetUsAscii = textPlainCharsetUsAscii
    )

}
fun FormatsEntity.toFormats():Formats{
    return Formats(
        image = imageJpeg
    )
}