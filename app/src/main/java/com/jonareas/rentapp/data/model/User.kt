package com.jonareas.rentapp.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class User(
    @PrimaryKey(autoGenerate = true)
    val idUser: Int = 0,
    @ColumnInfo(name = "userName")
    val userName: String,
    @ColumnInfo(name = "name")
    val fullName: String,
    @ColumnInfo(name = "email")
    val email: String,
    @ColumnInfo(name = "password")
    val password: String,
    @ColumnInfo(name = "phone")
    val phone: String,
    @ColumnInfo(name = "state")
    val state: Boolean
) {}