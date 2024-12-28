package com.koindsl.di

import com.koindsl.demo.Car
import com.koindsl.demo.Clutch
import com.koindsl.demo.Stearing
import com.koindsl.demo.my_interface.DemoInterfaceImpl
import org.koin.dsl.module

val demoModule= module {

    factory { Car(get(),get()) }
    factory { Clutch() }
    factory { Stearing()  }
//    single { Engine() }//singleton
}