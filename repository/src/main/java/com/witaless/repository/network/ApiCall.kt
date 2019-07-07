package com.witaless.repository.network

import com.witaless.repository.BuildConfig
import okhttp3.HttpUrl

object ApiCall {
    const val DEFAULT_PAGE = 1
    const val DEFAULT_COUNTRY_LANGUAGE = "us"
    const val DEFAULT_CATEGORY = "general"
    private const val DEFAULT_SORT_BY = "relevancy"

    private const val API_KEY = BuildConfig.API_KEY
    private const val API_KEY_PARAM_NAME = "apiKey"
    private const val COUNTRY_PARAM_NAME = "country"
    private const val CATEGORY_PARAM_NAME = "category"
    private const val PAGE_PARAM_NAME = "page"
    private const val LANGUAGE_PARAM_NAME = "language"
    private const val QUERY_PARAM_NAME = "q"
    private const val SORT_BY_PARAM_NAME = "sortBy"
    private const val TOP_HEADLINES_BASE_ENDPOINT = "https://newsapi.org/v2/top-headlines"
    private const val EVERYTHING_BASE_ENDPOINT = "https://newsapi.org/v2/everything"

    fun getTopHeadlinesEndpoint(page: Int, country: String, category: String): String {
        val urlBuilder: HttpUrl.Builder = HttpUrl.parse(TOP_HEADLINES_BASE_ENDPOINT).newBuilder()
        urlBuilder.addQueryParameter(API_KEY_PARAM_NAME, API_KEY)
        urlBuilder.addQueryParameter(COUNTRY_PARAM_NAME, country)
        urlBuilder.addQueryParameter(CATEGORY_PARAM_NAME, category)
        urlBuilder.addQueryParameter(PAGE_PARAM_NAME, page.toString())

        return urlBuilder.build().toString()
    }

    fun getSearchEverythingEndpoint(q: String, page: Int, language: String): String {
        val urlBuilder: HttpUrl.Builder = HttpUrl.parse(EVERYTHING_BASE_ENDPOINT).newBuilder()
        urlBuilder.addQueryParameter(API_KEY_PARAM_NAME, API_KEY)
        urlBuilder.addQueryParameter(QUERY_PARAM_NAME, q)
        urlBuilder.addQueryParameter(LANGUAGE_PARAM_NAME, language)
        urlBuilder.addQueryParameter(SORT_BY_PARAM_NAME, DEFAULT_SORT_BY)
        urlBuilder.addQueryParameter(PAGE_PARAM_NAME, page.toString())

        return urlBuilder.build().toString()
    }

}