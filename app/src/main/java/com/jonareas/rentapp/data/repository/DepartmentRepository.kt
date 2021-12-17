package com.jonareas.rentapp.data.repository

import com.jonareas.rentapp.data.model.Department

interface DepartmentRepository  {

    fun getAll() : List<Department>

}