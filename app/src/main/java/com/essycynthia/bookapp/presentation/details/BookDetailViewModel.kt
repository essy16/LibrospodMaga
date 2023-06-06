package com.essycynthia.bookapp.presentation.details

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.essycynthia.bookapp.common.Constants
import com.essycynthia.bookapp.common.Resource
import com.essycynthia.bookapp.domain.use_cases.books_cases.getbooks_cases.ChildrenBooksCases
import com.essycynthia.bookapp.domain.use_cases.books_cases.getbooks_cases.FrenchBooksCases
import com.essycynthia.bookapp.domain.use_cases.books_cases.getbooks_cases.PopularBookCases
import com.essycynthia.bookapp.domain.use_cases.books_cases.getbooks_cases.SpanishBooksCases
import com.essycynthia.bookapp.domain.use_cases.books_cases.getbooksdetails_cases.BookDetailCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class BookDetailViewModel @Inject constructor(
    private val getBookDetailCases: BookDetailCase,
    private val savedStateHandle: SavedStateHandle

) : ViewModel() {
    private val _state = mutableStateOf(BookDetailState())
    val state: State<BookDetailState> = _state

    init {
        savedStateHandle.get<String>(Constants.PARAM_SAVED_STATE)?.let { id ->
            getBookDetails(id)
        }    }

    private fun getBookDetails(id: String) {
        getBookDetailCases(id).onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = BookDetailState(book = result.data)
                }
                is Resource.Error -> {
                    _state.value = BookDetailState(
                        error = result.message ?: "An unexpected error occured"
                    )
                }
                is Resource.Loading -> {
                    _state.value = BookDetailState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }

}