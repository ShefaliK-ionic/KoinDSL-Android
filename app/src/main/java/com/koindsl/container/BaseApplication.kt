package com.koindsl.container

import android.app.Application
import com.koindsl.di.demoModule
import com.koindsl.di.interfaceModule
import org.koin.core.context.startKoin

class BaseApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(demoModule, interfaceModule)//need to specify modify which we need to use in our app
        }
    }
}