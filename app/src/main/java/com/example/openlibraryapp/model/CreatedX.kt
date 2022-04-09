package com.example.openlibraryapp.model


import com.google.gson.annotations.SerializedName

data class CreatedX(
    @SerializedName("type")
    val type: String,
    @SerializedName("value")
    val value: String
)