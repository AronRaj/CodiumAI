package com.app.codiumdemo.data.api

import com.app.codiumdemo.data.model.TopHeadlinesResponse
import retrofit2.http.POST
import retrofit2.http.Query

interface NewsEndpoint {

    @POST("top-headlines")
    suspend fun getTopHeadlines(@Query("country") country: String): TopHeadlinesResponse

}