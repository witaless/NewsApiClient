package com.witaless.repository

interface IDataCallback<T> {

    fun onSuccess(resultList: ArrayList<T>)
    fun onError(error: Error)

    enum class Error {
        API_ERROR,
        NETWORK_ERROR
    }
}