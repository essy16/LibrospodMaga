package com.essycynthia.bookapp.presentation.books_list.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.essycynthia.bookapp.domain.models.Books

@Composable
fun BookListItem(
    books: Books,
    onItemClick:(Books)->Unit
){
    Row(Modifier.fillMaxWidth()
        .clickable { onItemClick(books) }) {
        Text(text = "${books.resultDtos?.title}")

    }

}