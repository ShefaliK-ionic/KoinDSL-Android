package com.koindsl.container

import com.koindsl.demo.Car
import org.koin.core.component.KoinComponent
import org.koin.core.component.get
import org.koin.core.component.inject

class Component:KoinComponent {
//when access first time
 val engine:Car by inject()
    //when app launch initialize
 val engine1:Car=get()


}