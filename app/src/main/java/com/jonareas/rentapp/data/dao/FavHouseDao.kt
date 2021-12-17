package com.jonareas.rentapp.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.jonareas.rentapp.data.model.FavHouse


@Dao
abstract class FavHouseDao : BaseDao<FavHouse> {

    @Query("SELECT * FROM favHouse WHERE house_favorite_id = :id")
    abstract fun getById(id: Int) : FavHouse

    @Query("SELECT * FROM favHouse WHERE user_id = :id")
    abstract fun getByUserId(id: Int): FavHouse

    @Query("SELECT * FROM favHouse")
    abstract fun getAll() : LiveData<List<FavHouse>>

}