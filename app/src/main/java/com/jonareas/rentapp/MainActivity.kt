package com.jonareas.rentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.jonareas.rentapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentLandlord) as NavHostFragment

        val navController = navHostFragment.navController

        appBarConfiguration = AppBarConfiguration(setOf(R.id.search_house,
            R.id.edit_house,
            R.id.add_house,
            R.id.edit_profile,
            R.id.settings))

        setupActionBarWithNavController(navController = navController,
            configuration = appBarConfiguration)

        binding.bottomNavigation.setupWithNavController(navController)


    }
}