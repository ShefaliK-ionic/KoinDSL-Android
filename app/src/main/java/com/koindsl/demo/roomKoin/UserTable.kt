package com.koindsl.demo.roomKoin

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
data class UserTable(@PrimaryKey val id:Int, val name:String)