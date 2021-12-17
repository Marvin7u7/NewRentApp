package com.jonareas.rentapp.data.repository

import androidx.lifecycle.LiveData
import com.jonareas.rentapp.data.model.User

interface UserRepository : BaseRepository<User> {

    fun getAll() : LiveData<List<User>>

}