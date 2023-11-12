package com.essycynthia.bookapp.presentation

sealed class Screen (val route: String){
    object BookListScreen: Screen("book_list_screen")
    object BookDetailScreen: Screen("book_detail_screen")
    object SearchScreen: Screen("search_screen")
    object LikedScreen: Screen("liked_screen")
}
