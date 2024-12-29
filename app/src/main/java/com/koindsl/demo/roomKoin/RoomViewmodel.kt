package com.koindsl.demo.roomKoin

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.koindsl.demo.roomKoin.UserDao
import com.koindsl.demo.roomKoin.UserTable
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class RoomViewmodel constructor( private val dao: UserDao):ViewModel() {



    fun addRoomUser(){

        viewModelScope.launch {

         var a1=   async {
                dao.insert(UserTable(-1,"Shrit"))
            }
            Log.d("222", "add: "+a1.await())

            var a2=  async {dao.getAllUser()}
            Log.d("222", "getRoomUser: "+a2.await())

        }



    }
}