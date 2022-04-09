package com.example.openlibraryapp.model


import com.google.gson.annotations.SerializedName

data class Links(
    @SerializedName("author")
    val author: String,
    @SerializedName("next")
    val next: String,
    @SerializedName("self")
    val self: String
)