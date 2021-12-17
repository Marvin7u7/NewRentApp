package com.jonareas.rentapp

import android.app.Application
import com.jonareas.rentapp.data.RentAppDatabase

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