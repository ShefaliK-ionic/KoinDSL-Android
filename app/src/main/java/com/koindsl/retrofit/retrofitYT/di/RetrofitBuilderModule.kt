package com.koindsl.retrofit.retrofitYT.di

import com.koindsl.retrofit.retrofitYT.ApiInterface
import com.koindsl.retrofit.retrofitYT.RetroViewmodel
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

val retrofitBuilderModule = module {
    single { provideMoshi()  }
    single { provideApiService(get())  }
    viewModel { RetroViewmodel(get()) }
}

fun provideMoshi():Moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

fun provideApiService(moshi: Moshi):ApiInterface=Retrofit.Builder().run {
    baseUrl(ApiInterface.BASE_URL)
    addConverterFactory(MoshiConverterFactory.create(moshi))
    build()
}.create(ApiInterface::class.java)

