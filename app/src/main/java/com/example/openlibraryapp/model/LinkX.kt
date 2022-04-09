package com.example.openlibraryapp.model


import com.google.gson.annotations.SerializedName

data class LinkX(
    @SerializedName("title")
    val title: String,
    @SerializedName("type")
    val type: TypeXXX,
    @SerializedName("url")
    val url: String
)