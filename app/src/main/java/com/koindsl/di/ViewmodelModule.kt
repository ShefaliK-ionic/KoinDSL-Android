package com.koindsl.di

import com.koindsl.demo.viewmodel.MainViewmodel
import com.koindsl.demo.viewmodel.Test
import com.koindsl.demo.viewmodel.TestImpl
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.bind
import org.koin.dsl.module

val viewmodelModule= module {
    factory { TestImpl() } bind Test::class
    viewModel { MainViewmodel(get()) }
}