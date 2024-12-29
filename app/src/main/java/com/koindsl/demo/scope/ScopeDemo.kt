package com.koindsl.demo.scope

import android.util.Log
import com.koindsl.MainActivity
import org.koin.dsl.module
import org.koin.dsl.scoped

class ComponentA {
    fun getComponentA(){
        Log.d("222", "getComponentA: ")
    }
}

var myScopeModule = module {

    scope<MainActivity>{
      scoped<ComponentA>()
    }
}