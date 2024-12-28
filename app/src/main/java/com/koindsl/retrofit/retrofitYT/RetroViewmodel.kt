package com.koindsl.retrofit.retrofitYT

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class RetroViewmodel constructor(private val apiInterface: ApiInterface):ViewModel() {

    fun callApi(){
        viewModelScope.launch {

        var res=async{ apiInterface.getPost()}
            Log.d("222", "callApi: "+res.await())
//            Log.d("222", "callApi: "))
    }}
}