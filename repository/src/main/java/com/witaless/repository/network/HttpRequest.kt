package com.witaless.repository.network

import android.os.AsyncTask
import okhttp3.OkHttpClient
import okhttp3.Request

class HttpRequest {

    companion object {
        val instance = HttpRequest()
        private val okHttpClient = OkHttpClient()
    }

    fun sendRequest(url: String, httpCallback: HttpCallback) {
        GetRequestTask(httpCallback).execute(url)
    }

    private class GetRequestTask(val httpCallback: HttpCallback) : AsyncTask<String, Void, String>() {
        override fun doInBackground(vararg params: String?): String {
            val url = params[0]

            val request = Request.Builder()
                .get()
                .url(url)
                .build()

            return okHttpClient.newCall(request).execute().body().string()
        }

        override fun onPostExecute(result: String) {
            httpCallback.onSuccess(result)
        }
    }

}