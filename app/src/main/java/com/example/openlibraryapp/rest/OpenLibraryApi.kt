package com.example.openlibraryapp.rest

import com.example.openlibraryapp.model.AuthorDetail
import com.example.openlibraryapp.model.ResultAuthors
import com.example.openlibraryapp.model.ResultWorks
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface OpenLibraryApi {



    @GET(SEARCH_AUTHOR)
    suspend fun getAuthorByName(
        @Query("q") authorName: String
    ): Response<ResultAuthors>

    @GET("authors/{id}.json")
    suspend fun getAuthorDetails(
        @Path("id") id:String
    ): Response<AuthorDetail>

    @GET("authors/{id}/works.json")
    suspend fun getAuthorWorks(
        @Path("id") id:String
    ): Response<ResultWorks>



    companion object{


        const val BASE_URL = "https://openlibrary.org/"


        private const val SEARCH_AUTHOR = "search/authors.json"

        //private const val GET_WORKS = ONE_JOKE + BATCH_LENGTH




    }










//    https://openlibrary.org/search/authors.json?q=j%20k%20rowling
//    https://openlibrary.org/authors/OL23919A/works.json
//    https://openlibrary.org/authors/OL23919A.json
}