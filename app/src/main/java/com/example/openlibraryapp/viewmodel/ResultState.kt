package com.example.openlibraryapp.viewmodel

sealed class ResultState{
    object LOADING : ResultState()
    class SUCCESS<T>(val response: T): ResultState()
    class ERROR(val error: Throwable) : ResultState()
}
