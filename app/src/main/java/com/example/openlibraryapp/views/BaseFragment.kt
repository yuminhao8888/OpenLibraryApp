package com.example.openlibraryapp.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.openlibraryapp.R
import com.example.openlibraryapp.di.OpenLibraryApp
import com.example.openlibraryapp.rest.OpenLibraryRepository
import com.example.openlibraryapp.viewmodel.OpenLibraryViewModel
import com.example.openlibraryapp.viewmodel.OpenLibraryViewModelFactory
import javax.inject.Inject


open class BaseFragment : Fragment() {
    @Inject
    lateinit var libraryRepository: OpenLibraryRepository

    public val viewModel by lazy {
        ViewModelProvider(requireActivity(), OpenLibraryViewModelFactory(libraryRepository))[OpenLibraryViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        OpenLibraryApp.libraryComponent.inject(this)
    }
}