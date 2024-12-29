package com.koindsl

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.koindsl.container.Component
import com.koindsl.demo.scope.ComponentA
import org.koin.androidx.scope.activityScope
import org.koin.core.component.KoinScopeComponent
import org.koin.core.scope.Scope

class MainActivity : AppCompatActivity(),KoinScopeComponent {
    override val scope: Scope by activityScope()
    private val com_A:ComponentA by scope.inject()
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
//        component.retroViewmodel.callApi()
//        component.roomViewmodel.addRoomUser()
        //qualifier
//        component.userModuleQualifier.getUser()

        //scope
        com_A.getComponentA()

    }
}