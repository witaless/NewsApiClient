package com.witaless.repository.repository

import com.witaless.repository.DataCallback
import com.witaless.repository.model.Article

class NewsRepositoryImpl : NewsRepository {
    override fun getSearchResult(
        q: String,
        page: Int,
        language: String,
        dataCallback: DataCallback<ArrayList<Article>>
    ) {

    }

    override fun getTopHeadlines(
        page: Int,
        country: String,
        category: String,
        dataCallback: DataCallback<ArrayList<Article>>
    ) {

    }

    override fun getLikedArticles(dataCallback: DataCallback<ArrayList<Article>>) {

    }

    override fun getArticle(id: Int, dataCallback: DataCallback<Article>) {

    }

    override fun addArticleToLiked(id: Int) {

    }

    override fun removeArticleFromLiked(id: Int) {

    }
}