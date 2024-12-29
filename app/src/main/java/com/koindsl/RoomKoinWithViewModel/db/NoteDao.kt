package com.koindsl.RoomKoinWithViewModel.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {
   @Insert(onConflict = OnConflictStrategy.REPLACE)
   suspend fun insertNote( notesEntity: NotesEntity)

   @Query("SELECT* FROM NOTESENTITY")
   fun getAllNotes(): Flow<MutableList<NotesEntity>>

}