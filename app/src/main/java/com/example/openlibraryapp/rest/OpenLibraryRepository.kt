package com.example.openlibraryapp.rest

import com.example.openlibraryapp.model.AuthorDetail
import com.example.openlibraryapp.model.ResultAuthors
import com.example.openlibraryapp.model.ResultWorks
import retrofit2.Response

interface OpenLibraryRepository {
    suspend fun getAuthorByName(authorName: String): Response<ResultAuthors>
    suspend fun getAuthorDetails(id:String): Response<AuthorDetail>
    suspend fun getAuthorWorks(id:String): Response<ResultWorks>
}

class OpenLibraryRepositoryImpl(
    private val restApi: OpenLibraryApi
) : OpenLibraryRepository {

    override suspend fun getAuthorByName(authorName: String): Response<ResultAuthors> =
        restApi.getAuthorByName(authorName)

    override suspend fun getAuthorDetails(id:String): Response<AuthorDetail> =
        restApi.getAuthorDetails(id)

    override suspend fun getAuthorWorks(id:String): Response<ResultWorks> =
        restApi.getAuthorWorks(id)

}