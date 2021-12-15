package com.jonareas.rentapp.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favHouse")
data class FavHouse(
    @PrimaryKey(autoGenerate = true)
    var favoriteHouseId: Int = 0,
    @ColumnInfo(name = "house_favorite_id")
    var houseId: Int = 0,
    @ColumnInfo(name = "user_id")
    var userId: Int = 0
)