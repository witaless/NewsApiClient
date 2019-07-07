package com.witaless.repository.network

import com.google.gson.Gson

object JsonConverter {
    fun <T> parseJson(json: String, model: Class<T>): T {
        val gson = Gson()

        return gson.fromJson(json, model)
    }
}