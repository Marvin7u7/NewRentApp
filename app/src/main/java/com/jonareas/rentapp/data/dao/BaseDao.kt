package com.jonareas.rentapp.data.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update
import com.jonareas.rentapp.data.model.Persistable

/**
 * Base Dao
 *  @param T Generic Type
 */
interface BaseDao<T : Persistable> {
    /**
     * Insert an entity in the database.
     *
     * @param entity the model to be inserted.
     */
    @Insert
    fun insert(entity: T)

    /**
     * Insert an array of entities in the database.
     *
     * @param entity the model to be inserted.
     */
    @Insert
    fun insert(vararg entity: T)

    /**
     * Update an entity from the database.
     *
     * @param entity the entities to be updated
     */
    @Update
    fun update(entity: T)

    /**
     * Delete an entity from the database
     *
     * @param entity the entity to be deleted
     */
    @Delete
    fun delete(entity: T)
}