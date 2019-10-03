package com.example.secureapi.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    fun getRetrofit():Retrofit{
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        val okHttpClient = OkHttpClient.Builder().addInterceptor(interceptor) // This is used to add ApplicationInterceptor.
            .build();
        return Retrofit.Builder().baseUrl("http://13.126.249.141/").addConverterFactory(GsonConverterFactory.create()).client(okHttpClient).build()
    }
}