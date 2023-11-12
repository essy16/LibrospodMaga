package com.essycynthia.bookapp.data.local

import androidx.room.Entity
import com.essycynthia.bookapp.domain.models.Formats
import com.google.gson.annotations.SerializedName
@Entity
data class FormatsEntity(
    val applicationepubzip: String,
    val applicationOctetStream: String,
    val applicationRdfXml: String,
    val applicationxMobipocketEbook: String,
    val imageJpeg: String,
    val textHTML: String,
    val textPlain: String,
    val textPlainCharsetUsAscii: String
)

