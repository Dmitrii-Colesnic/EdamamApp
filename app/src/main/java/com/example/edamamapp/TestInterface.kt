package com.example.edamamapp

import android.util.Log

interface TestInterface {

    val firstName: String
    val lastName: String
    val fullName: String
        get() = "$firstName + $lastName"

}