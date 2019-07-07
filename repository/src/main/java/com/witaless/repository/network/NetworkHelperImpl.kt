package com.witaless.repository.network

import com.witaless.repository.DataCallback
import com.witaless.repository.model.Article
import com.witaless.repository.model.BaseResponseObject
import com.witaless.repository.model.OkNewsResponseObject

class NetworkHelperImpl : NetworkHelper {

    override fun getTopHeadlines(
        page: Int,
        country: String,
        category: String,
        dataCallback: DataCallback<ArrayList<Article>>
    ) {
        val url = ApiCall.getTopHeadlinesEndpoint(page, country, category)
        HttpRequest.instance.sendRequest(url, object : HttpCallback {
            override fun onSuccess(result: String) {
                val status = JsonConverter.parseJson(result, BaseResponseObject::class.java).status
                if (status == BaseResponseObject.STATUS_OK) {
                    dataCallback.onSuccess(JsonConverter.parseJson(result, OkNewsResponseObject::class.java).articles)
                } else {
                    dataCallback.onError(DataCallback.Error.API_ERROR)
                }
            }

            override fun onError(error: String) {
                dataCallback.onError(DataCallback.Error.NETWORK_ERROR)
            }

        })
    }

    override fun getSearchResult(
        q: String,
        page: Int,
        language: String,
        dataCallback: DataCallback<ArrayList<Article>>
    ) {
        val url = ApiCall.getSearchEverythingEndpoint(q, page, language)
        HttpRequest.instance.sendRequest(url, object : HttpCallback {
            override fun onSuccess(result: String) {
                val status = JsonConverter.parseJson(result, BaseResponseObject::class.java).status
                if (status == BaseResponseObject.STATUS_OK) {
                    dataCallback.onSuccess(JsonConverter.parseJson(result, OkNewsResponseObject::class.java).articles)
                } else {
                    dataCallback.onError(DataCallback.Error.API_ERROR)
                }
            }

            override fun onError(error: String) {
                dataCallback.onError(DataCallback.Error.NETWORK_ERROR)
            }

        })
    }
}