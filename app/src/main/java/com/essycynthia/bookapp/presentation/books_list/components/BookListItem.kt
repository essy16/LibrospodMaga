package com.essycynthia.bookapp.presentation.books_list.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.essycynthia.bookapp.domain.models.Books
import com.essycynthia.bookapp.domain.models.Result

@Composable
fun BookListItem(
    result: Result,
    onItemClick: (Result) -> Unit
) {

  Column(
      Modifier
          .width(160.dp)
          .height(250.dp)
          .clickable { onItemClick(result) }) {
      AsyncImage(
          modifier = Modifier.size(150.dp),
          model = result.formats?.image.toString(),
          contentDescription =result.formats?.image.toString(),
      )
      Spacer(modifier = Modifier.height(12.dp))

      Text(text = result.title.toString())
      Spacer(modifier = Modifier.height(12.dp))

      Text(text = result.authors?.firstOrNull()?.name.toString())
  }

}