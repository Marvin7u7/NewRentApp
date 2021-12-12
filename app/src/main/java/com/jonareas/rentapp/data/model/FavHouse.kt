package com.jonareas.rentapp.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favhouse")
data class FavHouse(
    @PrimaryKey(autoGenerate = true)
    val idFavHouse: Int = 0,
    @ColumnInfo(name = "idHouse")
    val idHouse: Int = 0,
    @ColumnInfo(name = "idUser")
    val idUser: Int = 0,
    @ColumnInfo(name = "state")
    val state: Boolean
) {}