package com.jonareas.rentapp.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.jonareas.rentapp.data.model.User


@Dao
abstract class UserDao : BaseDao<User> {

    @Query("SELECT * FROM user")
    abstract fun getAll(): LiveData<List<User>>
}