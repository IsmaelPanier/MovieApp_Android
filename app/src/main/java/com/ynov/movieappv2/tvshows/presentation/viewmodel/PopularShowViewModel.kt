package com.ynov.movieappv2.tvshows.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ynov.movieappv2.tvshows.data.repository.PopularShowsRepositoryImpl
import com.ynov.movieappv2.tvshows.domain.model.PopularShow
import com.ynov.movieappv2.tvshows.domain.usecase.GetPopularShowsUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class PopularShowsViewModel : ViewModel() {

    private val _shows = MutableStateFlow<List<PopularShow>>(emptyList())
    val shows: StateFlow<List<PopularShow>> = _shows

    private val repository = PopularShowsRepositoryImpl()
    private val useCase = GetPopularShowsUseCase(repository)

    init {
        viewModelScope.launch {
            try {
                val result = useCase()
                if (result.isEmpty()) {
                    // fallback en cas d’erreur silencieuse
                    _shows.value = listOf(
                        PopularShow(0, "Aucune série récupérée", "")
                    )
                } else {
                    _shows.value = result
                }
            } catch (e: Exception) {
                // fallback en cas d’erreur API
                _shows.value = listOf(
                    PopularShow(-1, "Erreur de chargement : ${e.message}", "")
                )
            }
        }
    }
}
