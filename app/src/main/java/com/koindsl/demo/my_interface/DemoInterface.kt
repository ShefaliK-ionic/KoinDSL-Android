package com.koindsl.demo.my_interface

import android.util.Log

interface DemoInterface {

    fun getInterfaceFun()
}


interface DemoInterfaceTwo{
    fun interfaceDemo2()
}

class DemoInterfaceImpl :DemoInterface,DemoInterfaceTwo{
    override fun getInterfaceFun() {
        Log.d("222", "getInterfaceFun:onee ")
    }

    override fun interfaceDemo2() {
        Log.d("222", "getInterfaceFun:twooo ")
    }

}

class MainDemo(val demoInterface: DemoInterface,val demoInterfaceTwo: DemoInterfaceTwo){

    fun getDemo(){
        demoInterface.getInterfaceFun()
        demoInterfaceTwo.interfaceDemo2()
    }
}