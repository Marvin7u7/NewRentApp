package com.jonareas.rentapp.ui

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextThemeWrapper
import androidx.fragment.app.FragmentActivity
import com.jonareas.rentapp.MainActivity
import com.jonareas.rentapp.R
import com.jonareas.rentapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)

        with(binding)
        {
            buttonLogin.setOnClickListener {
                fireActivityByClass(MainActivity::class.java)
                fadeAnimation()
            }

            textViewSignUp.setOnClickListener {
                fireActivityByClass(SignUpActivity::class.java)
            }
        }
    }

    private fun <T : AppCompatActivity> fireActivityByClass(activityClass : Class<T>, context : Context = this@LoginActivity) =
        startActivity(Intent(context, activityClass))

    private fun fadeAnimation() = overridePendingTransition(R.anim.fade_in, R.anim.fade_out)


}