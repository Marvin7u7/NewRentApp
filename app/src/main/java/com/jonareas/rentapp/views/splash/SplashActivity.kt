package com.jonareas.rentapp.views.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.jonareas.rentapp.R
import com.jonareas.rentapp.databinding.ActivitySplashBinding
import com.jonareas.rentapp.views.login.LoginActivity

class SplashActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        startSplashScreen()
        animateView()

    }

    private fun startSplashScreen(timeDelayInMilis : Long = 1200)
    {

        Handler(Looper.myLooper()!!).postDelayed(
            {
                startFirstActivity()
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
                finish()
            }, timeDelayInMilis
        )
    }

    private fun animateView() =
        binding.apply {
            val fadeInTransition = AnimationUtils.loadAnimation(root.context, R.anim.slide_from_bottom)
            textViewRentappName.startAnimation(fadeInTransition)
            textViewRentappAuthor.startAnimation(fadeInTransition)
        }

    private fun startFirstActivity() =
            startActivity(Intent(this, LoginActivity::class.java))







}