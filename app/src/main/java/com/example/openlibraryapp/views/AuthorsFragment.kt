package com.example.openlibraryapp.views

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.openlibraryapp.R
import com.example.openlibraryapp.adapter.AuthorAdapter
import com.example.openlibraryapp.databinding.FragmentAuthorsBinding
import com.example.openlibraryapp.model.ResultAuthors
import com.example.openlibraryapp.viewmodel.ResultState


class AuthorsFragment : BaseFragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private val binding by lazy {
        FragmentAuthorsBinding.inflate(layoutInflater)
    }



    private val authorAdapter by lazy {
        AuthorAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding.authorRecycler.apply {
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            adapter = authorAdapter
        }

        viewModel.libraryData.observe(viewLifecycleOwner) { resultState ->
            Log.d("observe", "before when")
            when(resultState) {
                is ResultState.LOADING -> {
                    Toast.makeText(requireContext(), "LOADING...", Toast.LENGTH_LONG).show()
                }
                is ResultState.SUCCESS<*> -> {
                    Log.d("observe", "success")
                    //binding.progressBar.visibility = View.GONE
                    val authors = (resultState as ResultState.SUCCESS<ResultAuthors>).response.docs
                    authorAdapter.updateAuthors(authors)
                   // Log.d("joke12", authors[0].joke)
                    //displayInDialog(joke)
                    //ResultState.SUCCESS<ResultOne>
                    //weatherAdapter.setForecast(resultState.results.value)
                }
                is ResultState.ERROR -> {
                    Log.e("FORECAST", resultState.error.localizedMessage, resultState.error)
                    Toast.makeText(requireContext(), resultState.error.localizedMessage, Toast.LENGTH_LONG).show()
                }
            }
        }

        viewModel.getAuthorByName()

        return binding.root
    }


}