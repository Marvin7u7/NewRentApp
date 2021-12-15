package com.jonareas.rentapp.data

import android.app.Application
import com.jonareas.rentapp.data.database.RentAppDatabase

class RentAppApplication : Application() {

    companion object {
        lateinit var rentAppDatabase : RentAppDatabase private set

        lateinit var instance : RentAppApplication
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        rentAppDatabase = RentAppDatabase.database(instance)
    }

}