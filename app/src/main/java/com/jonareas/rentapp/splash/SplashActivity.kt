package com.jonareas.rentapp.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.jonareas.rentapp.R
import com.jonareas.rentapp.ui.LoginActivity
import com.jonareas.rentapp.ui.SignUpActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val TIME_DELAY_IN_MILIS = 1000.toLong()

        Handler(Looper.myLooper()!!).postDelayed(
            {
                startFirstActivity()
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
                finish()
            }, TIME_DELAY_IN_MILIS
        )
    }

    private fun startFirstActivity() = startActivity(Intent(this, LoginActivity::class.java))







}