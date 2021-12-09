package com.jonareas.rentapp.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jonareas.rentapp.MainActivity
import com.jonareas.rentapp.R
import com.jonareas.rentapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)
        supportActionBar?.hide()

        with(binding)
        {
            buttonLogin.setOnClickListener {
                fireActivityFromLogin(MainActivity::class.java)
            }

            textViewSignUp.setOnClickListener {
                fireActivityFromLogin(SignUpActivity::class.java)
            }
        }
    }

    private fun <T : AppCompatActivity> fireActivityFromLogin(activityClass : Class<T>, context : Context = this@LoginActivity) {
        startActivity(Intent(context, activityClass))
        fadeAnimation()
    }

    private fun fadeAnimation() = overridePendingTransition(R.anim.fade_in, R.anim.fade_out)


}