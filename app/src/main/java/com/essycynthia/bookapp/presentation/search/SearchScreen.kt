package com.essycynthia.bookapp.presentation.search

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.essycynthia.bookapp.presentation.Screen
import com.essycynthia.bookapp.presentation.books_list.BookListViewModel
import com.essycynthia.bookapp.presentation.books_list.components.BookListItem

@Composable
fun SearchScreen(
    navController:NavController,
    viewModel: SearchViewModel = hiltViewModel()
){
    val state = viewModel.state.collectAsState().value

    Column() {
        SearchBar(
            hint = "Search for a book or a writer",
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)

        )
        {
            viewModel.search(it)

        }
        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(8.dp)

        ) {
            items(state.books) { result ->
                SearchItem(
                    result = result
                ) {
                    navController.navigate(Screen.BookDetailScreen.route + "/${it.id.toString()}")
                }
            }
        }
    }

}
@Composable
fun SearchBar(
    modifier: Modifier = Modifier,
    hint: String = "",
    onSearch: (String) -> Unit = {},

    ) {
    var text by remember {
        mutableStateOf("")
    }
    var isHintDisplayed by remember {
        mutableStateOf(hint != "")
    }

    Box(modifier = modifier) {
        BasicTextField(
            value = text,
            onValueChange = {
                text = it
                onSearch(it)
            },
            maxLines = 1,
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .shadow(5.dp, CircleShape)
                .background(
                    MaterialTheme.colors.primaryVariant, CircleShape
                )
                .padding(horizontal = 12.dp, vertical = 12.dp)

        )
        if (isHintDisplayed) {
            Text(
                text = hint,
                color = Color.LightGray,
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 12.dp)
            )
        }
    }
}
