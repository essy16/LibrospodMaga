package com.essycynthia.bookapp.presentation.books_list.components

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.DrawerValue
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.material.rememberDrawerState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.Card
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.essycynthia.bookapp.R
import com.essycynthia.bookapp.domain.models.ParentDataClass
import com.essycynthia.bookapp.presentation.Screen
import com.essycynthia.bookapp.presentation.books_list.BookListViewModel
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun BookListScreen(
    navController: NavController,
    viewModel: BookListViewModel = hiltViewModel(),

) {
     val dataStore : DataStore<Preferences>
    var checked by remember { mutableStateOf(false) }
    MaterialTheme(
        colors = if (checked) {
            darkColors() // Use dark theme colors
        } else {
            lightColors() // Use light theme colors
        }
    ) {
        val state = viewModel.state.collectAsState().value
        val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Open))
        Scaffold(
            scaffoldState = scaffoldState,
            topBar = {
                TopAppBar(
                    title = {
                        Text(
                            stringResource(id = R.string.app_name), color = if (checked) {
                                Color.White
                            } else {
                                Color.Black
                            }
                        )
                    },
                    backgroundColor = if (checked) {
                        Color.Black
                    } else {
                        Color.White
                    },
                    actions = {

                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Switch(
                                checked = checked,
                                onCheckedChange = { checked = it },
                                colors = SwitchDefaults.colors(
                                    checkedThumbColor = Color.Black,
                                    checkedTrackColor = Color.White,
                                    uncheckedThumbColor = Color.White,
                                    uncheckedTrackColor = Color.Black
                                ),
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Spacer(modifier = Modifier.width(8.dp))
                            Image(
                                painter = painterResource(R.drawable.resource__),
                                contentDescription = "Profile Picture",
                                modifier = Modifier
                                    .size(40.dp)
                                    .clip(CircleShape)
                            )
                        }

                    }
                )
            },

            content = {
                Column(modifier = Modifier.fillMaxSize()) {
                    Column(Modifier.fillMaxWidth(0.5f)) {
                        Text(
                            text = stringResource(id = R.string.welcome_back) + ", Esther",
                            fontWeight = FontWeight.ExtraLight,
                            fontSize = 16.sp
                        )
                        Text(
                            text = stringResource(id = R.string.what_do_you_want),
                            fontWeight = FontWeight.Bold,
                            fontSize = 24.sp
                        )
                    }
                    SearchBar(
                        hint = "Search...",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)

                    )
                    {

                    }
                    Column {
                        Text(
                            text = stringResource(id = R.string.popular_books),
                            fontSize = 30.sp,
                            fontWeight = FontWeight.ExtraBold
                        )
                        Spacer(modifier = Modifier.height(16.dp))

                        Box(modifier = Modifier.fillMaxSize()) {
                            LazyColumn(
                                modifier = Modifier.fillMaxSize(),
                                contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
                            ) {
                                item {
                                    Text(
                                        text = "Popular Books",
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier.padding(8.dp)
                                    )
                                    LazyRow(
                                        modifier = Modifier.fillMaxWidth()
                                    ) {
                                        items(state.popularBookS) { result ->
                                            BookListItem(
                                                result = result
                                            ) {
                                                navController.navigate(Screen.BookDetailScreen.route + "/${it.id.toString()}")
                                            }
                                        }
                                    }
                                }
                                item {
                                    Text(
                                        text = "Children's Books",
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier.padding(8.dp)
                                    )
                                    LazyRow(
                                        modifier = Modifier.fillMaxWidth()
                                    ) {
                                        items(state.childrenBookS) { result ->
                                            BookListItem(
                                                result = result
                                            ) {
                                                navController.navigate(Screen.BookDetailScreen.route + "/${it.id.toString()}")
                                            }
                                        }
                                    }
                                }
                            }
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
                }
            })
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
//@Composable
//fun allBooks(parentList:ArrayList<ParentDataClass>){
//    LazyColumn(){
//        items(){
//            ColumnItemUi(
//                parentList = parentList,
//                itemIndex = it
//            )
//        }
//    }
//}
//
//@Composable
//fun ColumnItemUi(parentList: ArrayList<ParentDataClass>, itemIndex: Int) {
//    Card {
//        Text(text = parentList[itemIndex].title)
//        LazyRow(){
//            items(){
//                RowItemUi()
//            }
//        }
//    }
//}
//
//@Composable
//fun RowItemUi() {
//    Column {
//        BookListItem(result =, onItemClick =)
//    }
//}


