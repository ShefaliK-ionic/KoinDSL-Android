package com.koindsl.container

import android.app.Application
import com.koindsl.di.demoModule
import com.koindsl.di.interfaceModule
import com.koindsl.di.viewmodelModule
import com.koindsl.retrofit.retrofitYT.di.retrofitBuilderModule
import org.koin.core.context.startKoin

class BaseApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(demoModule, interfaceModule, viewmodelModule, retrofitBuilderModule)//need to specify modify which we need to use in our app
        }
    }
}