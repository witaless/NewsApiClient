package com.witaless.repository.network

interface HttpCallback {
    fun onSuccess(result: String)
    fun onError(error: String)
}