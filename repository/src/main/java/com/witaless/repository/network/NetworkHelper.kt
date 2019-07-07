package com.witaless.repository.network

import com.witaless.repository.DataCallback
import com.witaless.repository.model.Article

interface NetworkHelper {
    fun getTopHeadlines(
        page: Int = ApiCall.DEFAULT_PAGE,
        country: String = ApiCall.DEFAULT_COUNTRY_LANGUAGE,
        category: String = ApiCall.DEFAULT_CATEGORY,
        dataCallback: DataCallback<ArrayList<Article>>
    )

    fun getSearchResult(
        q: String,
        page: Int = ApiCall.DEFAULT_PAGE,
        language: String = ApiCall.DEFAULT_COUNTRY_LANGUAGE,
        dataCallback: DataCallback<ArrayList<Article>>
    )
}