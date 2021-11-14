package com.example.kotlinsingletonexample

import com.example.kotlinsingletonexample.models.User

object ExampleSingleton {

    val singletonUser: User by lazy {
        User("mrx45ru@gmail.com", "Alex", "image.png")
    }
}