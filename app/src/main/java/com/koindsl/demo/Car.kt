package com.koindsl.demo

import android.util.Log

class Car constructor(val stearing: Stearing,val clutch: Clutch){


    fun getCar(){
        Log.d("222", "getCar: ")
        stearing.getStearing()
        clutch.getClutch()
    }
}

class Stearing {


    fun getStearing(){
        Log.d("222", "getStearing: ")
    }
}

class Clutch {

    fun getClutch(){
        Log.d("222", "getClutch: ")
    }
}