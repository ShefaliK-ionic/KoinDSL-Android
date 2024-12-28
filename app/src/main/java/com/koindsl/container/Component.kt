package com.koindsl.container

import com.koindsl.demo.Car
import com.koindsl.demo.my_interface.MainDemo
import com.koindsl.demo.viewmodel.MainViewmodel
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
}