package com.koindsl.demo.roomKoin

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [UserTable::class], version = 1)
abstract class UserDb :RoomDatabase(){
    abstract fun getUserDao():UserDao


}