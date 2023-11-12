package com.essycynthia.bookapp.presentation.bottom_navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.essycynthia.bookapp.presentation.Screen
import com.essycynthia.bookapp.presentation.books_details.components.BookDetailScreen
import com.essycynthia.bookapp.presentation.books_list.BookListViewModel
import com.essycynthia.bookapp.presentation.books_list.components.BookListScreen
import com.essycynthia.bookapp.presentation.search.SearchScreen

@Composable
fun BottomNavGraph(navContoller: NavHostController) {

    NavHost(
        navController = navContoller,
        startDestination = Screen.BookListScreen.route
    ) {
        composable(
            route = Screen.BookListScreen.route
        ) {
            BookListScreen(navContoller)
        }
        composable(
            route = Screen.BookDetailScreen.route + "/{id}"
        ) {
            BookDetailScreen(navController = navContoller)
        }
        composable(
            route = Screen.SearchScreen.route
        ) {
            SearchScreen(navController = navContoller)
        }

    }


}