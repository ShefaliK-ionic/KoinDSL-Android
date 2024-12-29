package com.koindsl.demo.qualifier

import android.util.Log
import org.koin.core.qualifier.named
import org.koin.dsl.module

class UserModuleQualifier(val fname:String,val lname:String) {

    fun getUser(){
        Log.d("222", "getUser: $fname $lname")
    }

}

val userModule= module {
      factory { UserModuleQualifier(get(named("fname")),get(named("lname"))) }
      factory(named("fname")){
          provideFirstname()
      }

    factory(named("lname")){
        provideLastname()
    }
}

fun provideFirstname():String="Shrit"
fun provideLastname():String="Devoy"