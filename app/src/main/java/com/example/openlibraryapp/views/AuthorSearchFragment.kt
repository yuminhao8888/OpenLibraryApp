package com.example.openlibraryapp.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.openlibraryapp.R
import com.example.openlibraryapp.databinding.FragmentAuthorSearchBinding
import androidx.navigation.fragment.findNavController


class AuthorSearchFragment : BaseFragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private val binding by lazy {
        FragmentAuthorSearchBinding.inflate(layoutInflater)
    }

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        arguments?.let {
//            param1 = it.getString(ARG_PARAM1)
//            param2 = it.getString(ARG_PARAM2)
//        }
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding.buttonSearch.setOnClickListener {
            viewModel.authorName = binding.editTextName.text.toString()
            findNavController().navigate(R.id.action_authorSearchFragment_to_authorsFragment)
        }
        // Inflate the layout for this fragment
        return binding.root
    }


}