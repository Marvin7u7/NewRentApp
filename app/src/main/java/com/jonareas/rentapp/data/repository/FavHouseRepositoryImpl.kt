package com.jonareas.rentapp.data.repository

import androidx.lifecycle.LiveData
import com.jonareas.rentapp.data.RentAppApplication
import com.jonareas.rentapp.data.database.dao.FavHouseDao
import com.jonareas.rentapp.data.model.FavHouse

class FavHouseRepositoryImpl: FavHouseRepository {
    private val favHouseDao: FavHouseDao by lazy {
        RentAppApplication.rentAppDatabase.favHouseDao()
    }

    override suspend fun saveFavHouse(favHouse: FavHouse) = favHouseDao.insert(favHouse)

    override suspend fun updateFavHouse(favHouse: FavHouse) = favHouseDao.update(favHouse)

    override suspend fun getAllFavHousesById(id: Int) = favHouseDao.getById(id)

    override suspend fun getAllFavHousesByUserId(id: Int): LiveData<List<FavHouse>> = favHouseDao.getByUserId(id)

    override suspend fun removeFavHouse(favHouse: FavHouse) = favHouseDao.delete(favHouse)
}