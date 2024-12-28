package com.koindsl.di

import com.koindsl.demo.my_interface.DemoInterface
import com.koindsl.demo.my_interface.DemoInterfaceImpl
import com.koindsl.demo.my_interface.DemoInterfaceTwo
import com.koindsl.demo.my_interface.MainDemo
import org.koin.dsl.bind
import org.koin.dsl.binds
import org.koin.dsl.module

val interfaceModule = module {
    //3 ways to provide dependency to interface
//    factory { DemoInterfaceImpl() as DemoInterface}//not recom interface dependency
//    factory<DemoInterface> { DemoInterfaceImpl() }
//    factory { DemoInterfaceImpl() } bind DemoInterface::class for single interface
    factory { DemoInterfaceImpl() } binds arrayOf(DemoInterface::class, DemoInterfaceTwo::class)
    factory { MainDemo(get(),get()) }
}