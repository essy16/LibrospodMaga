package com.essycynthia.bookapp.data.mappers

import com.essycynthia.bookapp.data.local.ResultEntity
import com.essycynthia.bookapp.data.remote.ResultDto
import com.essycynthia.bookapp.domain.models.Result

fun ResultDto.toResultsEntity(): ResultEntity {
    return ResultEntity(
        id = id,
        title = title,
        authors = authors?.map {
             it.toAuthorEntity()
        },
        subjects = subjects,
        bookshelves = bookshelves,
        languages = languages,
        copyright = copyright,
        mediaType = mediaType,
        downloadCount = downloadCount,
        formats = formats?.toFormatsEntity()
    )
}

fun ResultEntity.toResults(): Result {
    return Result(
        id = id,
        title = title,
        authors = authors?.map {
                              it.toAuthors()
        },
        subjects = subjects,
        bookshelves = bookshelves,
        languages = languages,
        copyright = copyright,
        formats = formats?.toFormats()
    )

}

