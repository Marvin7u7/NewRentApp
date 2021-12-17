package com.jonareas.rentapp.data.repository

import androidx.lifecycle.LiveData
import com.jonareas.rentapp.RentAppApplication
import com.jonareas.rentapp.data.dao.FavHouseDao
import com.jonareas.rentapp.data.model.FavHouse

class FavHouseRepositoryImpl: FavHouseRepository {

    private val favHouseDao: FavHouseDao by lazy {
        RentAppApplication.rentAppDatabase.favHouseDao()
    }

    override fun getById(id: Int): FavHouse = favHouseDao.getById(id)

    override fun getByUserId(userId: Int): FavHouse = favHouseDao.getByUserId(userId)

    override fun getAll(): LiveData<List<FavHouse>> = favHouseDao.getAll()

    override suspend fun save(entity: FavHouse) = favHouseDao.insert(entity)

    override suspend fun save(vararg entity: FavHouse) = favHouseDao.insert(*entity)

    override suspend fun edit(entity: FavHouse) = favHouseDao.update(entity)

    override suspend fun remove(entity: FavHouse) = favHouseDao.delete(entity)


}