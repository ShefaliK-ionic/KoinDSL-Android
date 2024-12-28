package com.koindsl.demo.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlin.math.log

class MainViewmodel(private val test: Test):ViewModel() {
   fun getTest(){
      Log.d("222", "getTest: Viewmode;")
   }
}