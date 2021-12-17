package com.jonareas.rentapp.data.model

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "house")
data class House(
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "house_id")
    var houseId: Int = 0,
    @ColumnInfo(name = "title")
    var title: String,
    @ColumnInfo(name = "description")
    var description: String,
    @ColumnInfo(name = "photo")
    var photo: String,
    @ColumnInfo(name = "floors")
    var floors: Int = 0,
    @ColumnInfo(name = "rooms")
    var rooms: Int = 0,
    @ColumnInfo(name = "bathRooms")
    var bathRooms: Int = 0,
    @ColumnInfo(name = "area")
    var area: Double = 0.0,
    @ColumnInfo(name = "parking")
    var parking: Int = 0
) : Persistable