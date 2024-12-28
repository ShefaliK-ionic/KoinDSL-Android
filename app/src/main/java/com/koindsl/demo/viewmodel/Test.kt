package com.koindsl.demo.viewmodel

import android.util.Log

interface Test {
    fun getTest()
}

class TestImpl:Test{
    override fun getTest() {
        Log.d("222", "getTest: TestImpl viewmodel")
    }

}