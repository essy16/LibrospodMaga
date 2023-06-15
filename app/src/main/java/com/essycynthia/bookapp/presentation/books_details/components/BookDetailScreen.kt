package com.essycynthia.bookapp.presentation.books_details.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.essycynthia.bookapp.presentation.books_details.BookDetailViewModel
@Composable
fun BookDetailScreen(

    viewModel: BookDetailViewModel = hiltViewModel()

){
    val state = viewModel.state.value


    Box(Modifier.fillMaxSize()) {
        state.book.let {bookDetail ->  Text(text ="${bookDetail?.results?.title}" )
            Text(text ="${bookDetail?.results?.subjects}" )
            Text(text ="${bookDetail?.results?.languages}" )
            Text(text ="${bookDetail?.results?.download_count}" )  }

        if(state.error.isNotBlank()) {
            Text(
                text = state.error,
                color = MaterialTheme.colors.error,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .align(Alignment.Center)
            )
        }
        if(state.isLoading) {
            CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
        }
    }


}