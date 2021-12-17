package com.jonareas.rentapp.views.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.jonareas.rentapp.R
import com.jonareas.rentapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var appBarConfiguration : AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_fragment_main) as NavHostFragment

        val navController = navHostFragment.navController

        appBarConfiguration = AppBarConfiguration(setOf(
            R.id.nav_main_search_house,
            R.id.nav_main_favorites,
            R.id.nav_main_add_house,
            R.id.nav_main_my_houses,
            R.id.nav_main_edit_profile,
        ))


        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.bottomNavigation.setupWithNavController(navController)
    }


}