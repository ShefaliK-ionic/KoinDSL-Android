package com.koindsl.container

import android.app.Application
import com.koindsl.demo.qualifier.userModule
import com.koindsl.demo.roomKoin.di.roomModule
import com.koindsl.demo.scope.myScopeModule
import com.koindsl.di.demoModule
import com.koindsl.di.interfaceModule
import com.koindsl.di.viewmodelModule
import com.koindsl.retrofit.retrofitYT.di.retrofitBuilderModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BaseApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@BaseApplication)
            modules(demoModule, interfaceModule, viewmodelModule, retrofitBuilderModule,roomModule,userModule,
                myScopeModule)//need to specify modify which we need to use in our app
        }


    }
}