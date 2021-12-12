package com.jonareas.rentapp.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "house")
data class House(
    @PrimaryKey(autoGenerate = true)
    val idHouse: Int = 0,
    @ColumnInfo(name = "photo")
    val photo: String,
    @ColumnInfo(name = "floors")
    val floors: Int = 0,
    @ColumnInfo(name = "rooms")
    val rooms: Int = 0,
    @ColumnInfo(name = "bathRooms")
    val bathRooms: Int = 0,
    @ColumnInfo(name = "description")
    val description: String,
    @ColumnInfo(name = "area")
    val area: Double = 0.0,
    @ColumnInfo(name = "parking")
    val parking: Int = 0,
    @ColumnInfo(name = "state")
    val state: Boolean
) {}