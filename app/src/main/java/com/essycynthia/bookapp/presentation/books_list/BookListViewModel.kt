package com.essycynthia.bookapp.presentation.books_list

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.essycynthia.bookapp.common.Constants
import com.essycynthia.bookapp.common.Resource
import com.essycynthia.bookapp.domain.use_cases.books_cases.getbooks_cases.PopularBookCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class BookListViewModel @Inject constructor(
    private val popularBookCases: PopularBookCases,

) : ViewModel() {
    private val _state = mutableStateOf(BookListState())
    val state: State<BookListState> = _state

    init {

            getPopularBooks()
        }

    private fun getPopularBooks() {
        popularBookCases().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = BookListState(book = result.data ?: emptyList())
                }
                is Resource.Error -> {
                    _state.value = BookListState(
                        error = result.message ?: "An unexpected error occurred"
                    )
                }
                is Resource.Loading -> {
                    _state.value = BookListState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }

}