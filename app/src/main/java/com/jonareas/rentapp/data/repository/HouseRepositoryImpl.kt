package com.jonareas.rentapp.data.repository

import androidx.lifecycle.LiveData
import com.jonareas.rentapp.RentAppApplication
import com.jonareas.rentapp.data.dao.HouseDao
import com.jonareas.rentapp.data.model.House

class HouseRepositoryImpl: HouseRepository {

    private val houseDao: HouseDao by lazy {
        RentAppApplication.rentAppDatabase.houseDao()
    }

    override fun getAll(): LiveData<List<House>> = houseDao.getAll()

    override suspend fun save(entity: House) = houseDao.insert(entity)

    override suspend fun save(vararg entity: House) = houseDao.insert(*entity)

    override suspend fun edit(entity: House) = houseDao.update(entity)

    override suspend fun remove(entity: House) = houseDao.delete(entity)


}