package com.jonareas.rentapp.data.repository

import androidx.lifecycle.LiveData
import com.jonareas.rentapp.data.model.FavHouse
import com.jonareas.rentapp.data.model.House

interface FavHouseRepository : BaseRepository<FavHouse> {

    fun getById(id : Int) : FavHouse

    fun getByUserId(userId : Int) : FavHouse

    fun getAll() : LiveData<List<FavHouse>>

}