package com.jonareas.rentapp.views.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.jonareas.rentapp.R
import com.jonareas.rentapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLoginBinding


    override fun onCreate(savedInstanceState: Bundle?) :Unit  {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_fragment_login) as NavHostFragment

        val navController = navHostFragment.navController

        // Top-level Destinations
        val appBarConfiguration =
            AppBarConfiguration(setOf(
                R.id.navigation_on_launch
            ))

        setupActionBarWithNavController(navController = navController, configuration = appBarConfiguration)

        //TODO: Set Up NavController, AppBarConfiguration, OnSupportNavigateUp

    }

}