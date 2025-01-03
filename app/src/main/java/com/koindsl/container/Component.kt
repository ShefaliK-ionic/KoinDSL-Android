package com.koindsl.container

import com.koindsl.RoomKoinWithViewModel.repository.DbRepository
import com.koindsl.RoomKoinWithViewModel.viewmodel.RoomDbViewmodel
import com.koindsl.demo.Car
import com.koindsl.demo.my_interface.MainDemo
import com.koindsl.demo.qualifier.UserModuleQualifier
import com.koindsl.demo.roomKoin.RoomViewmodel
import com.koindsl.demo.roomKoin.UserDao
import com.koindsl.demo.viewmodel.MainViewmodel
import com.koindsl.retrofit.retrofitYT.RetroViewmodel
import org.koin.core.component.KoinComponent
import org.koin.core.component.get
import org.koin.core.component.inject

class Component:KoinComponent {
    //2 ways to inject
//when access first time
 val engine:Car by inject()
    //when app launch initialize
 val engine1:Car=get()

 val mainDemo:MainDemo by inject()
    val viewmodel:MainViewmodel by inject()
    val retroViewmodel: RetroViewmodel by inject()
    val roomViewmodel: RoomViewmodel by inject()
    private val cityDao: UserDao by inject()
     val userModuleQualifier: UserModuleQualifier by inject()

    val roomDbViewmodel:RoomDbViewmodel by inject()
    val repository:DbRepository by inject()

}