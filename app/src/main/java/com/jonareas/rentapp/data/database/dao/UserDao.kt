package com.jonareas.rentapp.data.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.jonareas.rentapp.data.model.User


@Dao
abstract class UserDao : BaseDao<User> {

    /**
     * Get all data from the User table.
     */
    @Query("SELECT * FROM user")
    abstract fun getAll(): LiveData<List<User>>
}