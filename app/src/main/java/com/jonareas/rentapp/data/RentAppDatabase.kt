package com.jonareas.rentapp.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.jonareas.rentapp.data.dao.FavHouseDao
import com.jonareas.rentapp.data.dao.HouseDao
import com.jonareas.rentapp.data.dao.UserDao
import com.jonareas.rentapp.data.model.FavHouse
import com.jonareas.rentapp.data.model.House
import com.jonareas.rentapp.data.model.User

const val DATABASE_VERSION = 4

@Database(entities = [User::class, House::class, FavHouse::class], version = DATABASE_VERSION)
abstract class RentAppDatabase : RoomDatabase() {

    abstract fun houseDao(): HouseDao

    abstract fun userDao(): UserDao

    abstract fun favHouseDao(): FavHouseDao

    companion object {

        const val DATABASE_NAME = "RentAppDB"

        @Volatile
        private var INSTANCE: RentAppDatabase? = null

        fun database(context: Context): RentAppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                        context.applicationContext,
                        RentAppDatabase::class.java,
                        DATABASE_NAME
                ).fallbackToDestructiveMigration().build()

                return instance
            }
        }

    }

}