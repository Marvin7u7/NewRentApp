package com.jonareas.rentapp.data.repository

import androidx.lifecycle.LiveData
import com.jonareas.rentapp.data.RentAppApplication
import com.jonareas.rentapp.data.database.dao.HouseDao
import com.jonareas.rentapp.data.model.House

class HouseRepositoryImpl: HouseRepository {

    private val houseDao: HouseDao by lazy {
        RentAppApplication.rentAppDatabase.houseDao()
    }

    override suspend fun saveHouse(house: House) = houseDao.insert(house)

    override suspend fun updateHouse(house: House) = houseDao.update(house)

    override suspend fun getAllHouses(): LiveData<List<House>> = houseDao.getAllHouses()

    override suspend fun removeHouse(house: House) = houseDao.delete(house)
}