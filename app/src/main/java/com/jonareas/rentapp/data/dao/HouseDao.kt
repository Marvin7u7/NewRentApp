package com.jonareas.rentapp.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.jonareas.rentapp.data.model.House

@Dao
abstract class HouseDao :BaseDao<House> {
    @Query("SELECT * FROM house")
    abstract fun getAll(): LiveData<List<House>>
}