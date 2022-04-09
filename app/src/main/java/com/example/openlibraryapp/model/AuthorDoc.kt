package com.example.openlibraryapp.model


import com.google.gson.annotations.SerializedName

data class AuthorDoc(
    @SerializedName("alternate_names")
    val alternateNames: List<String>,
    @SerializedName("birth_date")
    val birthDate: String,
    @SerializedName("key")
    val key: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("top_subjects")
    val topSubjects: List<String>,
    @SerializedName("top_work")
    val topWork: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("_version_")
    val version: Long,
    @SerializedName("work_count")
    val workCount: Int
)