package com.koindsl.demo.roomKoin.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.koindsl.demo.roomKoin.RoomViewmodel
import com.koindsl.demo.roomKoin.UserDao
import com.koindsl.demo.roomKoin.UserDb
import org.koin.android.ext.koin.androidApplication
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val roomModule= module {

    single { provideUserDb(androidApplication()) }
//    single { provideDao(get()) }
    single { get<UserDb>().getUserDao() }
   viewModel { RoomViewmodel(get()) }
}

@Synchronized
fun provideUserDb(context: Context):UserDb=
Room.databaseBuilder(context,UserDb::class.java,"user_db").allowMainThreadQueries()
    .fallbackToDestructiveMigration().build()

@Synchronized
fun provideDao(userDb: UserDb):UserDao=userDb.getUserDao()