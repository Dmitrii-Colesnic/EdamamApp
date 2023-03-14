package com.example.edamamapp

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class ErrorInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request: Request = chain.request()
        val response = chain.proceed(request)
        when (response.code) {
            400, 403 -> {
                // error
            }
        }
        return response
    }
}