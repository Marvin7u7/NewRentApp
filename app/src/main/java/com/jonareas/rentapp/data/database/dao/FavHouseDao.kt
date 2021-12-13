package com.jonareas.rentapp.data.database.dao
import android.widget.ListView
import androidx.lifecycle.LiveData
import androidx.room.Query
import com.jonareas.rentapp.data.model.FavHouse

interface FavHouseDao : BaseDao<FavHouse> {

    @Query("SELECT * FROM favhouse WHERE idFavHouse = :id")
    suspend fun getById(id: Int) : FavHouse

    @Query("SELECT * FROM favhouse")
    suspend fun getAll() : LiveData<List<FavHouse>>

}