package com.example.openlibraryapp.model


import com.google.gson.annotations.SerializedName

data class Work(
    @SerializedName("authors")
    val authors: List<Author>,
    @SerializedName("covers")
    val covers: List<Int>,
    @SerializedName("created")
    val created: CreatedX,
    @SerializedName("description")
    val description: Any,
    @SerializedName("dewey_number")
    val deweyNumber: List<String>,
    @SerializedName("excerpts")
    val excerpts: List<Excerpt>,
    @SerializedName("first_publish_date")
    val firstPublishDate: String,
    @SerializedName("first_sentence")
    val firstSentence: FirstSentence,
    @SerializedName("key")
    val key: String,
    @SerializedName("last_modified")
    val lastModified: LastModifiedX,
    @SerializedName("latest_revision")
    val latestRevision: Int,
    @SerializedName("lc_classifications")
    val lcClassifications: List<String>,
    @SerializedName("links")
    val links: List<LinkX>,
    @SerializedName("revision")
    val revision: Int,
    @SerializedName("subject_people")
    val subjectPeople: List<String>,
    @SerializedName("subject_places")
    val subjectPlaces: List<String>,
    @SerializedName("subject_times")
    val subjectTimes: List<String>,
    @SerializedName("subjects")
    val subjects: List<String>,
    @SerializedName("subtitle")
    val subtitle: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("type")
    val type: TypeXXXX
)