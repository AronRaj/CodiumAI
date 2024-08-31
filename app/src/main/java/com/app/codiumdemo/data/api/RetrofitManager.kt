package com.app.codiumdemo.data.api

import com.app.codiumdemo.data.model.TopHeadlinesResponse

class RetrofitManager(private val newsEndpoint: NewsEndpoint) : ApiManager {

    suspend fun getTopHeadlines(country: String): TopHeadlinesResponse {
        return newsEndpoint.getTopHeadlines(country)
    }
}