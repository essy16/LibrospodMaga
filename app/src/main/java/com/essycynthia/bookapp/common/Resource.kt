package com.essycynthia.bookapp.common

sealed class Resource<T>(
    val data: T? = null,
    val message: String?
) {
    class Success<T>(data: T) : Resource<T>(data, null)
    class Error<T>(data: T, message: String?) : Resource<T>(data, message)
    class Loading<T>(data: T, message: String?) : Resource<T>(null, null)


}
