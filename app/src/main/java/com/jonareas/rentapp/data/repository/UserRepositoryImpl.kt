package com.jonareas.rentapp.data.repository

import androidx.lifecycle.LiveData
import com.jonareas.rentapp.RentAppApplication
import com.jonareas.rentapp.data.dao.UserDao
import com.jonareas.rentapp.data.model.User

class UserRepositoryImpl : UserRepository {

    private val userDao : UserDao by lazy {
        RentAppApplication.rentAppDatabase.userDao()
    }

    override fun getAll(): LiveData<List<User>> = userDao.getAll()

    override suspend fun save(entity: User) = userDao.insert(entity)

    override suspend fun save(vararg entity: User) = userDao.insert(*entity)

    override suspend fun edit(entity: User) = userDao.update(entity)

    override suspend fun remove(entity: User) = userDao.delete(entity)
    

}