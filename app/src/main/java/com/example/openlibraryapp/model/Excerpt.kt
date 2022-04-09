package com.example.openlibraryapp.model


import com.google.gson.annotations.SerializedName

data class Excerpt(
    @SerializedName("author")
    val author: AuthorXX,
    @SerializedName("comment")
    val comment: String,
    @SerializedName("excerpt")
    val excerpt: String
)