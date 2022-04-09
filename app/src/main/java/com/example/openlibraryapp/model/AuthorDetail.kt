package com.example.openlibraryapp.model


import com.google.gson.annotations.SerializedName

data class AuthorDetail(
    @SerializedName("alternate_names")
    val alternateNames: List<String>,
    @SerializedName("bio")
    val bio: String,
    @SerializedName("birth_date")
    val birthDate: String,
    @SerializedName("created")
    val created: Created,
    @SerializedName("entity_type")
    val entityType: String,
    @SerializedName("key")
    val key: String,
    @SerializedName("last_modified")
    val lastModified: LastModified,
    @SerializedName("latest_revision")
    val latestRevision: Int,
    @SerializedName("links")
    val links: List<Link>,
    @SerializedName("name")
    val name: String,
    @SerializedName("personal_name")
    val personalName: String,
    @SerializedName("photos")
    val photos: List<Int>,
    @SerializedName("remote_ids")
    val remoteIds: RemoteIds,
    @SerializedName("revision")
    val revision: Int,
    @SerializedName("source_records")
    val sourceRecords: List<String>,
    @SerializedName("title")
    val title: String,
    @SerializedName("type")
    val type: TypeX,
    @SerializedName("wikipedia")
    val wikipedia: String
)