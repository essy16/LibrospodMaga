package com.essycynthia.bookapp.presentation.books_list

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.essycynthia.bookapp.common.Resource
import com.essycynthia.bookapp.domain.use_cases.books_cases.getbooks_cases.ArtBooksCases
import com.essycynthia.bookapp.domain.use_cases.books_cases.getbooks_cases.BiographyBooksCases
import com.essycynthia.bookapp.domain.use_cases.books_cases.getbooks_cases.ChildrenBooksCases
import com.essycynthia.bookapp.domain.use_cases.books_cases.getbooks_cases.CookingBooksCases
import com.essycynthia.bookapp.domain.use_cases.books_cases.getbooks_cases.FantasyBooksCases
import com.essycynthia.bookapp.domain.use_cases.books_cases.getbooks_cases.FrenchBooksCases
import com.essycynthia.bookapp.domain.use_cases.books_cases.getbooks_cases.HistoryBooksCases
import com.essycynthia.bookapp.domain.use_cases.books_cases.getbooks_cases.LawBooksCases
import com.essycynthia.bookapp.domain.use_cases.books_cases.getbooks_cases.MysteryBooksCases
import com.essycynthia.bookapp.domain.use_cases.books_cases.getbooks_cases.PopularBookCases
import com.essycynthia.bookapp.domain.use_cases.books_cases.getbooks_cases.SpanishBooksCases
import com.essycynthia.bookapp.domain.use_cases.books_cases.getbooks_cases.TechnologyBooksCases
import com.essycynthia.bookapp.domain.use_cases.books_cases.getbooks_cases.TravelBooksCases
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
    private val artBooksCases: ArtBooksCases,
    private val biographyBooksCases: BiographyBooksCases,
    private val mysteryBooksCases: MysteryBooksCases,
    private val technologyBooksCases: TechnologyBooksCases,
    private val spanishBooksCases: SpanishBooksCases,
    private val travelBooksCases: TravelBooksCases,
    private val historyBooksCases: HistoryBooksCases,
    private val frenchBooksCases: FrenchBooksCases,
    private val lawBooksCases: LawBooksCases,
    private val cookingBooksCases: CookingBooksCases,
    private val fantasyBooksCases: FantasyBooksCases,
    private val childrenBooksCases: ChildrenBooksCases

) : ViewModel() {
    private val _state = MutableStateFlow(BookListState())
    val state: StateFlow<BookListState>
        get() = _state

    init {

        getPopularBooks()
        getChildrenBooks()

    }

    private fun getPopularBooks() {
        popularBookCases().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.update {
                        it.copy(
                            isLoading = false,
                            popularBookS = result.data?.result ?: emptyList()
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

    private fun getChildrenBooks() {
        childrenBooksCases().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.update {
                        it.copy(
                            isLoading = false,
                            childrenBookS = result.data?.result ?: emptyList()
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

    private fun getSpanishBooks() {
        spanishBooksCases().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.update {
                        it.copy(
                            isLoading = false,
                            spanishBookS = result.data?.result ?: emptyList()
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

    private fun getTravelBooks() {
        travelBooksCases().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.update {
                        it.copy(
                            isLoading = false,
                            travelBookS = result.data?.result ?: emptyList()
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

    private fun getHistoryBooks() {
        historyBooksCases().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.update {
                        it.copy(
                            isLoading = false,
                            historyBookS = result.data?.result ?: emptyList()
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

    private fun getFrenchBooks() {
        frenchBooksCases().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.update {
                        it.copy(
                            isLoading = false,
                            frenchBookS = result.data?.result ?: emptyList()
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

    private fun getLawBooks() {
        lawBooksCases().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.update {
                        it.copy(
                            isLoading = false,
                            lawBookS = result.data?.result ?: emptyList()
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

    private fun getCookingBooks() {
        cookingBooksCases().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.update {
                        it.copy(
                            isLoading = false,
                            cookingBooks = result.data?.result ?: emptyList()
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

    private fun getFantasyBooks() {
        fantasyBooksCases().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.update {
                        it.copy(
                            isLoading = false,
                            fantasyBookS = result.data?.result ?: emptyList()
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

    private fun getTechnologyBooks() {
        technologyBooksCases().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.update {
                        it.copy(
                            isLoading = false,
                            technologyBookS = result.data?.result ?: emptyList()
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

    private fun getMysteryBooks() {
        mysteryBooksCases().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.update {
                        it.copy(
                            isLoading = false,
                            mysteryBookS = result.data?.result ?: emptyList()
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

    private fun getBiographyBooks() {
        biographyBooksCases().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.update {
                        it.copy(
                            isLoading = false,
                            biographyBookS = result.data?.result ?: emptyList()
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

    private fun getArtBooks() {
        artBooksCases().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.update {
                        it.copy(
                            isLoading = false,
                            artBookS = result.data?.result ?: emptyList()
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