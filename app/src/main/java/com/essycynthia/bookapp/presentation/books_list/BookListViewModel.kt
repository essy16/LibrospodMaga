package com.essycynthia.bookapp.presentation.books_list

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.essycynthia.bookapp.common.Constants
import com.essycynthia.bookapp.common.Resource
import com.essycynthia.bookapp.domain.use_cases.books_cases.getbooks_cases.PopularBookCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class BookListViewModel @Inject constructor(
    private val popularBookCases: PopularBookCases,

) : ViewModel() {
    private val _state = MutableStateFlow(BookListState())
    val state: StateFlow<BookListState>
        get() = _state

    init {

            getPopularBooks()
        }

    private fun getPopularBooks() {
        popularBookCases().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.update {
                        it.copy(
                            isLoading = false,
                            book = result.data?.result ?: emptyList()
                        )
                    }
                    Log.d("BOOK_LIST", "Success : ${result.data?.result}")
                }
                is Resource.Error -> {
                    _state.update {
                        it.copy(
                            isLoading = false,
                            error = result.message ?: "Unexpected error occurred"
                        )
                    }
                    Log.d("BOOK_LIST", "error")
                }
                is Resource.Loading -> {
                    _state.update {
                        it.copy(
                            isLoading = true
                        )
                    }
                    Log.d("BOOK_LIST", "Loading")
                }
            }
        }.launchIn(viewModelScope)
    }

}