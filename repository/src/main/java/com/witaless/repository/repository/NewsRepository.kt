package com.witaless.repository.repository

import com.witaless.repository.DataCallback
import com.witaless.repository.model.Article
import com.witaless.repository.network.ApiCall

interface NewsRepository {

    fun getTopHeadlines(
        page: Int = ApiCall.DEFAULT_PAGE,
        country: String = ApiCall.DEFAULT_COUNTRY_LANGUAGE,
        category: String = ApiCall.DEFAULT_CATEGORY,
        dataCallback: DataCallback<ArrayList<Article>>
    )

    fun getSearchResult(
        q: String,
        page: Int = ApiCall.DEFAULT_PAGE,
        language: String = ApiCall.DEFAULT_COUNTRY_LANGUAGE
    )

    fun getLikedArticles(dataCallback: DataCallback<ArrayList<Article>>)

    fun getArticle(id: Int, dataCallback: DataCallback<Article>)

    fun addArticleToLiked(id: Int)

    fun removeArticleFromLiked(id: Int)
}