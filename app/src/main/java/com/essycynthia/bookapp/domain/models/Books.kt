package com.essycynthia.bookapp.domain.models

data class Books(
    val count: Int?,
    val next: Any?,
    val previous: Any?,
    val resultDtos: ArrayList<Result>
)
