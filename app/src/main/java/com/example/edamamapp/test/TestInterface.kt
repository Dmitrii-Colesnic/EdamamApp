package com.example.edamamapp.test

import android.util.Log

interface TestInterface {

    val firstName: String
    val lastName: String
    val fullName: String
        get() = "$firstName + $lastName"

}