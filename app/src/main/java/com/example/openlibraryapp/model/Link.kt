package com.example.openlibraryapp.model


import com.google.gson.annotations.SerializedName

data class Link(
    @SerializedName("title")
    val title: String,
    @SerializedName("type")
    val type: Type,
    @SerializedName("url")
    val url: String
)