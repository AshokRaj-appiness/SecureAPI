package com.example.secureapi.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.secureapi.model.Base
import com.example.secureapi.network.RetrofitClient
import com.example.secureapi.network.RetrofitInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MyViewModel(application: Application):AndroidViewModel(application) {
    var resultValue:MutableLiveData<Base> = MutableLiveData<Base>()

    external fun getToken(): String

    fun getResult(){
       val result = RetrofitClient.getRetrofit().create(RetrofitInterface::class.java).getQuestions(getToken())
        result.enqueue(object : Callback<Base> {
            override fun onFailure(call: Call<Base>, t: Throwable) {
               Log.d("error",t.message)
            }

            override fun onResponse(call: Call<Base>, response: Response<Base>) {
                resultValue.value = response.body()
            }


        })
    }
    fun getResponse():LiveData<Base>{
        return resultValue;
    }

    companion object{
        init {
            System.loadLibrary("native-lib")
        }
    }
}