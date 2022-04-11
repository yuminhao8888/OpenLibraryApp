package com.example.openlibraryapp.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.openlibraryapp.model.AuthorDetail
import com.example.openlibraryapp.model.ResultAuthors
import com.example.openlibraryapp.model.ResultWorks
import com.example.openlibraryapp.rest.OpenLibraryRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class OpenLibraryViewModel (
    private val libraryRepository: OpenLibraryRepository,

    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : ViewModel() {



    public var name = ""

    public var isScreenRotated = false

    init {
        Log.d("viewmodel","view model is created")
    }

    //var platform: PlatformType = PlatformType.ANDROID

    private val _libraryData: MutableLiveData<ResultState> = MutableLiveData(ResultState.LOADING)
    val libraryData: LiveData<ResultState> get() = _libraryData

    fun getAuthorByName(authorName: String) {
        viewModelScope.launch(ioDispatcher) {
            try {
                val response = libraryRepository.getAuthorByName(authorName)
                if(response.isSuccessful) {
                    response.body()?.let {
//                        databaseRepo.insertGiveaways(it)
//                        val localData = databaseRepo.getAllGiveaways()
                        _libraryData.postValue(ResultState.SUCCESS<ResultAuthors>(it))
                    } ?: throw Exception("Response in null")
                } else {
                    throw Exception("No successful response")
                }
            } catch (e: Exception) {
                // we catch all errors
                _libraryData.postValue(ResultState.ERROR(e))
                //loadFromDB()
            }
        }
    }

    fun getAuthorDetails(id:String) {
        viewModelScope.launch(ioDispatcher) {
            try {
                val response = libraryRepository.getAuthorDetails(id)
                if(response.isSuccessful) {
                    response.body()?.let {
//                        databaseRepo.insertGiveaways(it)
//                        val localData = databaseRepo.getAllGiveaways()
                        _libraryData.postValue(ResultState.SUCCESS<AuthorDetail>(it))
                    } ?: throw Exception("Response in null")
                } else {
                    throw Exception("No successful response")
                }
            } catch (e: Exception) {
                // we catch all errors
                _libraryData.postValue(ResultState.ERROR(e))
                //loadFromDB()
            }
        }
    }

    fun getAuthorWorks(id:String) {
        viewModelScope.launch(ioDispatcher) {
            try {
                val response = libraryRepository.getAuthorWorks(id)
                if(response.isSuccessful) {
                    response.body()?.let {
//                        databaseRepo.insertGiveaways(it)
//                        val localData = databaseRepo.getAllGiveaways()
                        _libraryData.postValue(ResultState.SUCCESS<ResultWorks>(it))
                    } ?: throw Exception("Response in null")
                } else {
                    throw Exception("No successful response")
                }
            } catch (e: Exception) {
                // we catch all errors
                _libraryData.postValue(ResultState.ERROR(e))
                //loadFromDB()
            }
        }
    }

}