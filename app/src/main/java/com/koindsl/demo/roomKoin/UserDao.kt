package com.koindsl.demo.roomKoin

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {
    @Insert
    suspend fun insert(userTable: UserTable)

    @Query("SELECT * FROM USERTABLE")
    fun getAllUser(): Flow<List<UserTable>>
}