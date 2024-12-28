package com.koindsl.container

import android.app.Application
import com.koindsl.di.demoModule
import org.koin.core.context.startKoin

class BaseApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(demoModule)//need to specify modify which we need to use in our app
        }
    }
}