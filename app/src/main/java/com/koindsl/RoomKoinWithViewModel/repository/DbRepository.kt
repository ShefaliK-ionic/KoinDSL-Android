package com.koindsl.RoomKoinWithViewModel.repository

import com.koindsl.RoomKoinWithViewModel.db.NoteDao
import com.koindsl.RoomKoinWithViewModel.db.NotesEntity

class DbRepository constructor(val dao: NoteDao) {

   suspend fun addNotes(entity: NotesEntity)=dao.insertNote(entity)
   suspend fun getNotes()=dao.getAllNotes()

}