package com.example.secureapi.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.secureapi.R
import com.example.secureapi.model.Base
import com.example.secureapi.viewmodel.MyViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myViewModel = ViewModelProviders.of(this).get(MyViewModel::class.java)
        myViewModel.getResult()
        myViewModel.getResponse().observe(this,object:Observer<Base>{
            override fun onChanged(t: Base?) {
                Log.d("==>",t?.data?.get(0)?.name)
            }


        })


    }
}
