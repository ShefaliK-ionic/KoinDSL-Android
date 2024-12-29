package com.koindsl.RoomKoinWithViewModel.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class NotesEntity(@PrimaryKey(autoGenerate = true) val id:Int, val title:String, val des:String)

