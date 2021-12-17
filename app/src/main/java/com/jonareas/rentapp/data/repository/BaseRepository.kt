package com.jonareas.rentapp.data.repository

interface BaseRepository<T> {
    suspend fun save(entity : T)

    suspend fun save(vararg entity : T)

    suspend fun edit(entity : T)

    suspend fun remove(entity : T)
}