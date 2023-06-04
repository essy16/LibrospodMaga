data class BooksList(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<Result>
)