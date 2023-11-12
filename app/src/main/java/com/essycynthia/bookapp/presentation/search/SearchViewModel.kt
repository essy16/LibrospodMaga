package com.essycynthia.bookapp.presentation.search

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.essycynthia.bookapp.common.Resource
import com.essycynthia.bookapp.domain.repositories.BookRepository
import com.essycynthia.bookapp.domain.use_cases.books_cases.getbooks_cases.SearchCase
import com.essycynthia.bookapp.presentation.books_list.BookListState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val repository: BookRepository,
    private val searchCase: SearchCase
) : ViewModel() {
    private val _state = MutableStateFlow(SearchState())
    val state: StateFlow<SearchState>
        get() = _state
    fun search(authorOrBook: String) {
        searchCase(authorOrBook).onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.update {
                        it.copy(
                            isLoading = false,
                            books = result.data?.result ?: emptyList()
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