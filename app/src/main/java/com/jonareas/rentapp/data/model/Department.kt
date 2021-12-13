package com.jonareas.rentapp.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "department")
data class Department (
    @PrimaryKey(autoGenerate = true)
    val idDepartment: Int = 0,
    @ColumnInfo(name = "departamentName")
    val departmentName : String
){}

