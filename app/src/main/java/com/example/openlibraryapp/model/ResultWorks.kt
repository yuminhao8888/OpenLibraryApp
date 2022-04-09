package com.example.openlibraryapp.model


import com.google.gson.annotations.SerializedName

data class ResultWorks(
    @SerializedName("entries")
    val entries: List<Work>,
    @SerializedName("links")
    val links: Links,
    @SerializedName("size")
    val size: Int
)