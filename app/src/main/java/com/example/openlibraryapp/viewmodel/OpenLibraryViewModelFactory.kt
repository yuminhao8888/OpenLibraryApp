package com.example.openlibraryapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.openlibraryapp.rest.OpenLibraryRepository

class OpenLibraryViewModelFactory (
    private val libraryRepository: OpenLibraryRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return OpenLibraryViewModel(libraryRepository) as T
    }

}