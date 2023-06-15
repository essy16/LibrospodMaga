package com.essycynthia.bookapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.essycynthia.bookapp.presentation.Screen
import com.essycynthia.bookapp.presentation.books_list.components.BookListScreen
import com.essycynthia.bookapp.presentation.books_details.components.BookDetailScreen
import com.essycynthia.bookapp.ui.theme.BookAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BookAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = Screen.BookListScreen.route
                    ) {
                        composable(
                            route = Screen.BookListScreen.route
                        ) {
                            BookListScreen(navController)
                        }
                        composable(
                            route = Screen.BookDetailScreen.route + "/{id}"
                        ) {
                            BookDetailScreen()
                        }
                    }
                }
            }
        }
    }
}

