package com.essycynthia.bookapp.presentation.search

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.essycynthia.bookapp.domain.models.Result

@Composable
fun SearchItem(
    result: Result,
    onItemClick: (Result) -> Unit
){
    Row(Modifier.fillMaxWidth()
        .clickable {
            onItemClick(result)
        }) {
        AsyncImage(
            modifier = Modifier.size(150.dp),
            model = result.formats?.image.toString(),
            contentDescription = result.formats?.image.toString(),
        )
        Text(text = result.title.toString())


    }
}