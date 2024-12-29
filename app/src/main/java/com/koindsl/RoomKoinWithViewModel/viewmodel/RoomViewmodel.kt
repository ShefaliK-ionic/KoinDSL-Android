package com.koindsl.RoomKoinWithViewModel.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.koindsl.RoomKoinWithViewModel.db.NoteDao
import com.koindsl.RoomKoinWithViewModel.db.NotesEntity
import com.koindsl.RoomKoinWithViewModel.repository.DbRepository
import kotlinx.coroutines.launch

class RoomDbViewmodel constructor(val repository: DbRepository):ViewModel() {

    private var _noteList=MutableLiveData<List<NotesEntity>>()
    val noteList:LiveData<List<NotesEntity>> = _noteList

    fun addNote(notesEntity: NotesEntity){

        viewModelScope.launch {

            repository.addNotes(notesEntity)

        }

    }

    fun getAllNotes(){

        viewModelScope.launch {

            repository.getNotes().collect{

                _noteList.value=it

            }

        }

    }

}