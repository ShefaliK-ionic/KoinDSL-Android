package com.koindsl.RoomKoinWithViewModel.di

import com.koindsl.RoomKoinWithViewModel.repository.DbRepository
import com.koindsl.RoomKoinWithViewModel.viewmodel.RoomDbViewmodel
import org.koin.android.ext.koin.androidApplication
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

var roomModuleMvvm= module {

    single { provideDb(androidContext()) }
    single { provideDao(get()) }
    factory { DbRepository(get()) }
    viewModel() { RoomDbViewmodel(get()) }
}