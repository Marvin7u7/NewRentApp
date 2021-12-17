package com.jonareas.rentapp.data.repository

import androidx.lifecycle.LiveData
import com.jonareas.rentapp.data.model.House

interface HouseRepository : BaseRepository<House> {
        fun getAll() : LiveData<List<House>>
}