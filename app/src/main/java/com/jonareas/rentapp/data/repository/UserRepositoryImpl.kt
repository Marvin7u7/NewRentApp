package com.jonareas.rentapp.data.repository

import androidx.lifecycle.LiveData
import com.jonareas.rentapp.data.RentAppApplication
import com.jonareas.rentapp.data.database.dao.UserDao
import com.jonareas.rentapp.data.model.User

class UserRepositoryImpl : UserRepository {

    private val userDao : UserDao by lazy {
        RentAppApplication.rentAppDatabase.userDao()
    }

    override suspend fun saveUser(user: User) = userDao.insert(user)

    override suspend fun update(user: User) = userDao.update(user)

    override suspend fun getAllUsers(): LiveData<List<User>> = userDao.getAll()

    override suspend fun remove(user : User) = userDao.delete(user)

}