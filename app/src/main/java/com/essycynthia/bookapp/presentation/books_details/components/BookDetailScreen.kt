package com.essycynthia.bookapp.presentation.books_details.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.darkColors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.lightColors
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.essycynthia.bookapp.R
import com.essycynthia.bookapp.common.Constants
import com.essycynthia.bookapp.presentation.books_details.BookDetailViewModel

@Composable
fun BookDetailScreen(
    navController: NavController,
    viewModel: BookDetailViewModel = hiltViewModel(),
) {
    val state = viewModel.state.value

//    MaterialTheme(
//        colors = if (Constants.checked) {
//            darkColors() // Use dark theme colors
//        } else {
//            lightColors() // Use light theme colors
//        }
//    ) {

        Column {
            var isClicked by remember { mutableStateOf(false) }

            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(top = 8.dp, bottom = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                IconButton(onClick = {
                    navController.popBackStack()
                }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Go back",
                        tint = MaterialTheme.colors.primaryVariant
                    )
                }
                IconButton(onClick = {
                    isClicked = true
                }) {
                    if (isClicked == false) {
                        Icon(
                            imageVector = Icons.Default.FavoriteBorder,
                            contentDescription = "Favorite empty",
                            tint = MaterialTheme.colors.primaryVariant
                        )
                    } else {
                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorite filled",
                            tint = MaterialTheme.colors.secondary
                        )
                    }
                }
            }
            Box(contentAlignment = Alignment.Center) {
                state.book.let { bookDetail ->

                    AsyncImage(
                        model = bookDetail?.result?.firstOrNull()?.formats?.image,
                        modifier = Modifier.size(350.dp),
                        contentDescription = "${bookDetail?.result?.firstOrNull()?.title}"
                    )

                    if (state.error.isNotBlank()) {
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
                    if (state.isLoading) {
                        CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
                    }
                }


            }
            state.book.let { bookDetail ->
                Text(
                    text = "${bookDetail?.result?.firstOrNull()?.authors?.firstOrNull()?.name}",
                    color = MaterialTheme.colors.primaryVariant
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = stringResource(
                        R.string.languages
                    ) + "  ${bookDetail?.result?.firstOrNull()?.languages}",
                    color = MaterialTheme.colors.primaryVariant
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = stringResource(
                        R.string.downloads
                    ) + " ${bookDetail?.result?.firstOrNull()?.download_count}",
                    color = MaterialTheme.colors.primaryVariant
                )


            }


            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(MaterialTheme.colors.secondary),
                modifier = Modifier.fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 50.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "Favorite filled",
                    tint = MaterialTheme.colors.primaryVariant
                )
                Text(
                    text = stringResource(id = R.string.sponsor_me),
                    color = MaterialTheme.colors.primaryVariant
                )

            }
        }
    }
//}