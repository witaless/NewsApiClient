package com.witaless.repository.model

import com.google.gson.annotations.SerializedName

data class OkNewsResponseObject(
    @SerializedName("status")
    val status: String?,

    @SerializedName("totalResults")
    val totalResults: Int?,

    @SerializedName("articles")
    val articles: ArrayList<Article>
)