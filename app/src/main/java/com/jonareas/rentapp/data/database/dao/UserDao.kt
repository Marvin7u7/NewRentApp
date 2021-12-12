package com.jonareas.rentapp.data.database.dao

import androidx.room.Dao
import com.jonareas.rentapp.data.model.User


@Dao
interface UserDao : BaseDao<User>