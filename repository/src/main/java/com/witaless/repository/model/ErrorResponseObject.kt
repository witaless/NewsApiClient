package com.witaless.repository.model

import com.google.gson.annotations.SerializedName

data class ErrorResponseObject(
    @SerializedName("status")
    val status: String?,

    @SerializedName("code")
    val code: String?,

    @SerializedName("message")
    val message: String?
)