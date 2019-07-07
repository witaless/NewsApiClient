package com.witaless.repository.model

import com.google.gson.annotations.SerializedName

data class BaseResponseObject(
    @SerializedName("status")
    val status: String
) {
    companion object {
        const val STATUS_OK = "ok"
        const val STATUS_ERROR = "error"
    }
}