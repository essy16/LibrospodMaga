package com.essycynthia.bookapp.presentation.bottom_navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.essycynthia.bookapp.presentation.Screen
import com.essycynthia.bookapp.presentation.books_details.components.BookDetailScreen
import com.essycynthia.bookapp.presentation.books_list.components.BookListScreen
import com.essycynthia.bookapp.presentation.search.SearchScreen
import kotlinx.coroutines.delay

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.BookListScreen.route
    ) {
        composable(
            route = Screen.BookListScreen.route
        ) {
            LaunchedEffect(navController) {
                // Coroutine logic can be placed here
                delay(1000) // Adjust the delay as needed
            }
            BookListScreen(navController)
        }
        composable(
            route = Screen.BookDetailScreen.route + "/{id}"
        ) {
            BookDetailScreen(navController = navController)
        }
        composable(
            route = Screen.SearchScreen.route
        ) {
            SearchScreen(navController = navController)
        }
    }
}


