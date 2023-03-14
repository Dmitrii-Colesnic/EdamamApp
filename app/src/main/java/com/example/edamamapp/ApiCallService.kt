package com.example.edamamapp

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiCallService {

    @GET("api/recipes/v2")
    fun getRecipes(
        @Query("type") type: String,
        @Query("app_id") appId: String,
        @Query("app_key") appKey: String,
        @Query("q") query: String
    ): Call<String>

}