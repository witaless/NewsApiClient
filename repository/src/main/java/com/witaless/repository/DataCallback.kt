package com.witaless.repository

interface DataCallback<T> {

    fun onSuccess(result: T)
    fun onError(error: Error)

    enum class Error {
        API_ERROR,
        NETWORK_ERROR
    }
}