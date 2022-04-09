package com.example.openlibraryapp.model


import com.google.gson.annotations.SerializedName

data class ResultAuthors(
    @SerializedName("docs")
    val docs: List<AuthorDoc>,
    @SerializedName("numFound")
    val numFound: Int,
    @SerializedName("numFoundExact")
    val numFoundExact: Boolean,
    @SerializedName("start")
    val start: Int
)