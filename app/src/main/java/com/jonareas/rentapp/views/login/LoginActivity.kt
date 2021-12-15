package com.jonareas.rentapp.views.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.jonareas.rentapp.R
import com.jonareas.rentapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLoginBinding
    private lateinit var appBarConfiguration : AppBarConfiguration
    private lateinit var navController : NavController


    override fun onCreate(savedInstanceState: Bundle?)  {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navController = (supportFragmentManager.findFragmentById(R.id.nav_fragment_login) as NavHostFragment).navController

        // Top-level Destinations
        appBarConfiguration =
            AppBarConfiguration(setOf(
                R.id.navigation_on_launch
            ))

        setupActionBarWithNavController(navController = navController, configuration = appBarConfiguration)
    }

    override fun onSupportNavigateUp(): Boolean  = navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()





}