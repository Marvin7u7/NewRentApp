package com.jonareas.rentapp.data.dao

import androidx.room.Dao
import com.jonareas.rentapp.data.models.User


@Dao
interface UserDao : BaseDao<User>