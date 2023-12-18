package com.essycynthia.bookapp.presentation.bottom_navigation

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Navigation() {
    val navController = rememberNavController()
    val screens = listOf(BottomBarScreen.BookListScreen, BottomBarScreen.SearchScreen)
    Scaffold(bottomBar = {
        BottomNavigation(modifier = Modifier.padding(16.dp)) {
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentRoute = navBackStackEntry?.destination?.route
            screens.forEach {
                BottomNavigationItem(
                    selected = currentRoute == it.route,
                    label = {
                        Text(
                            text = it.title,
                            color = if (currentRoute == it.route) Color.Red else Color.LightGray
                        )
                    },
                    onClick = {
                        if (currentRoute != it.route) {
                            navController.graph?.startDestinationRoute?.let {
                                navController.popBackStack(it, true)
                            }
                            navController.navigate(it.route) {
                                launchSingleTop = true
                            }

                        }
                    },
                    icon = {
                        Icon(
                            imageVector = it.icon,
                            contentDescription = null,
                            tint = if (currentRoute == it.route) Color.Red else Color.LightGray
                        )
                    })

            }
        }
    }) {
            BottomNavGraph(navController = navController)


    }
}


