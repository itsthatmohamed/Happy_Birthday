package com.example.happybirthday

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class HappyBirthdayViewModel: ViewModel() {

    private val _uiState = MutableStateFlow("Happy Birthday Ghena")
    val uiState: StateFlow<String> = _uiState

    fun onButtonPressed() {
        _uiState.update { "Happy Birthday Moban" }
    }
}