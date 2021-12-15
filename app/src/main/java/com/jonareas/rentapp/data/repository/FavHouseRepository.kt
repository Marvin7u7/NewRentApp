package com.jonareas.rentapp.data.repository

import androidx.lifecycle.LiveData
import com.jonareas.rentapp.data.model.FavHouse

interface FavHouseRepository {
    suspend fun saveFavHouse(favHouse: FavHouse)

    suspend fun updateFavHouse(favHouse: FavHouse)

    suspend fun getAllFavHousesById(id: Int): FavHouse

    suspend fun getAllFavHousesByUserId(id: Int): LiveData<List<FavHouse>>

    suspend fun removeFavHouse(favHouse: FavHouse)
}