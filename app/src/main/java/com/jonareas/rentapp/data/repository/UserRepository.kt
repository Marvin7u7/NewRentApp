package com.jonareas.rentapp.data.repository

import androidx.lifecycle.LiveData
import com.jonareas.rentapp.data.model.User

interface UserRepository {

    suspend fun saveUser(user : User)

    suspend fun update(user : User)

    suspend fun getAllUsers() : LiveData<List<User>>

    suspend fun remove(user : User)

}