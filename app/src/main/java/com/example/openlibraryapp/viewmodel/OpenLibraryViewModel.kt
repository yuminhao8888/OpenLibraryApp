package com.example.openlibraryapp.viewmodel

import androidx.lifecycle.ViewModel
import com.example.openlibraryapp.rest.OpenLibraryRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

class OpenLibraryViewModel (
    private val libraryRepository: OpenLibraryRepository,

    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : ViewModel() {
}