package com.example.happybirthday

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class HappyBirthdayViewModel(
    private val fakeAgeAPI: FakeAgeAPI
): ViewModel() {

    private val _uiState = MutableStateFlow("Happy Birthday Ghena")
    val uiState: StateFlow<String> = _uiState

    fun onButtonPressed() {
        _uiState.update { "Happy Birthday Moban" }
    }

    fun sum(number1: Int, number2: Int): Int {
        return number1 + number2
    }

    fun getPersonAge(): Int {
        val age = fakeAgeAPI.getPersonAge()
        return age + 5
    }
}