package com.example.edamamapp

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

const val BASE_URL = "https://api.edamam.com/"

class RetrofitFactory {

    companion object {

        val retrofit by lazy {
            val interceptor = HttpLoggingInterceptor()
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)

            val okHttpClient = OkHttpClient.Builder().addInterceptor(interceptor).build()

            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .client(okHttpClient)
                .build()
        }

        val getInstance by lazy {
            retrofit.create(ApiCallService::class.java)
        }

    }

}