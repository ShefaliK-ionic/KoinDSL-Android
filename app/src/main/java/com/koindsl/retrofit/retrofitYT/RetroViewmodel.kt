package com.koindsl.retrofit.retrofitYT

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.koindsl.demo.roomKoin.UserDao
import com.koindsl.demo.roomKoin.UserTable
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class RetroViewmodel constructor(private val apiInterface: ApiInterface):ViewModel() {

    fun callApi(){
        viewModelScope.launch {

        var res=async{ apiInterface.getPost()}
            Log.d("222", "callApi: "+res.await())
//            Log.d("222", "callApi: "))
    }}

//    fun addRoomUser(){
//
//        viewModelScope.launch {
//
//         var a1=   async {
//                dao.insert(UserTable(-1,"Shrit"))
//            }
//            Log.d("222", "add: "+a1.await())
//
//            var a2=  async {dao.getAllUser()}
//            Log.d("222", "getRoomUser: "+a2.await())
//
//        }
//
//
//
//    }
}