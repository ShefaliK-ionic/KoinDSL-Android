package com.koindsl.RoomKoinWithViewModel.di

import android.content.Context
import androidx.room.Room
import com.koindsl.RoomKoinWithViewModel.db.NoteDao
import com.koindsl.RoomKoinWithViewModel.db.NoteDatabase
import com.koindsl.RoomKoinWithViewModel.utils.Constants
import org.koin.dsl.module



fun provideDb(context: Context)=Room.databaseBuilder(context,NoteDatabase::class.java,Constants.NOTE_DATABASE)
    .allowMainThreadQueries().fallbackToDestructiveMigration().build()

fun provideDao(database: NoteDatabase)=database.noteDao()