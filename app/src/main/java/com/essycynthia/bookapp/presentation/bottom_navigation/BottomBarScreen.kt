package com.essycynthia.bookapp.presentation.bottom_navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector
import com.essycynthia.bookapp.presentation.Screen

sealed class BottomBarScreen(
    val route: String,
    val icon: ImageVector,
    val title: String
) {
    object BookListScreen : BottomBarScreen(
        route = Screen.BookListScreen.route,
        icon = Icons.Default.Home,
        title = "Home"
    )

    object SearchScreen : BottomBarScreen(
        route = Screen.SearchScreen.route,
        icon = Icons.Default.Search,
        title = "Search"
    )
}

