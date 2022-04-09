package com.example.openlibraryapp.model


import com.google.gson.annotations.SerializedName

data class Author(
    @SerializedName("author")
    val author: AuthorX,
    @SerializedName("type")
    val type: TypeXX
)