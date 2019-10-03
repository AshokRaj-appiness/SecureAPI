package com.example.secureapi.network

import com.example.secureapi.model.Base
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface RetrofitInterface {


    @GET("food-tinder/recipes")
    fun getQuestions(@Header("Authorization")  token:String): Call<Base>
}