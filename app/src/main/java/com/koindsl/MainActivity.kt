package com.koindsl

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.koindsl.container.Component

class MainActivity : AppCompatActivity() {
    //1. not proper way
//    private val engine:Engine by inject()
private val component=Component()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//         engine.getEngine()////1.1 not proper way
//        component.engine.getCar() //class
//        component.mainDemo.getDemo()//interface
//        component.viewmodel.getTest()//viewmode

//        retrofit
        component.retroViewmodel.callApi()
//        component.roomViewmodel.addRoomUser()
    }
}