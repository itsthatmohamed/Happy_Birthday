package com.example.happybirthday

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner
import org.mockito.kotlin.given

@RunWith(MockitoJUnitRunner::class)
class ExampleUnitTest {

    @Mock
    private lateinit var fakeAgeAPI: FakeAgeAPI

    private lateinit var viewModel: HappyBirthdayViewModel

    @Before
    fun before() {
        viewModel = HappyBirthdayViewModel(fakeAgeAPI)
    }

    @Test
    fun `Given numbers 2 and 1, When sum() called, Then return 3`() {
        // Given
        val number1 = 2
        val number2 = 1

        // When
        val result = viewModel.sum(number1, number2)

        // Then
        Assert.assertEquals(3, result)
    }

    @Test
    fun `Given API returns 30, When getPersonAge(), Then viewModel returns 30`() {
        // Given
        given(fakeAgeAPI.getPersonAge()).willReturn(30)

        // When
        val result = viewModel.getPersonAge()

        // Then
        Assert.assertEquals(35, result)
    }
}