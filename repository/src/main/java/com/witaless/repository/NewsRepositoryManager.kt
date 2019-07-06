package com.witaless.repository

import com.witaless.repository.repository.NewsRepository
import com.witaless.repository.repository.NewsRepositoryImpl

object NewsRepositoryManager {

    private val newsRepository = NewsRepositoryImpl()

    fun getNewsRepository(): NewsRepository = newsRepository

}