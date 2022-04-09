package com.example.openlibraryapp.model


import com.google.gson.annotations.SerializedName

data class RemoteIds(
    @SerializedName("isni")
    val isni: String,
    @SerializedName("viaf")
    val viaf: String,
    @SerializedName("wikidata")
    val wikidata: String
)