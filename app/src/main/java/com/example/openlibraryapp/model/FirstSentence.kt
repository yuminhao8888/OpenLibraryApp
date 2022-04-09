package com.example.openlibraryapp.model


import com.google.gson.annotations.SerializedName

data class FirstSentence(
    @SerializedName("type")
    val type: String,
    @SerializedName("value")
    val value: String
)