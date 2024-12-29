package com.koindsl.RoomKoinWithViewModel.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [NotesEntity::class], version = 1)
abstract class NoteDatabase : RoomDatabase() {

    abstract fun noteDao():NoteDao

}