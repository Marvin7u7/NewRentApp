package com.jonareas.rentapp.data.database.dao

import androidx.room.Query
import com.jonareas.rentapp.data.model.Department

interface DepartmentDao : BaseDao<Department>{

    @Query("SELECT departamentName FROM department")
    suspend fun getAllDepartment() : List<String>

}