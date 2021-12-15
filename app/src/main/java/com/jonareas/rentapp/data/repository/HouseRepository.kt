package com.jonareas.rentapp.data.repository

import androidx.lifecycle.LiveData
import com.jonareas.rentapp.data.model.House

interface HouseRepository {
    suspend fun saveHouse(house: House)

    suspend fun updateHouse(house: House)

    suspend fun getAllHouses(): LiveData<List<House>>

    suspend fun removeHouse(house: House)
}