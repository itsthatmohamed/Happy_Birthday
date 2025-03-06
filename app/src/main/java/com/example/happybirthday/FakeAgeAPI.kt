package com.example.happybirthday

import kotlin.random.Random

class FakeAgeAPI {

    fun getPersonAge(): Int {
        // Fake API Call

        return Random.nextInt()
    }
}