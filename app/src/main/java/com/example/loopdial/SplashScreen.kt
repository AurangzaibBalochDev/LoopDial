package com.example.loopdial

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.auth.CreateAccountActivity
import com.example.loopdial.databinding.ActivitySplashScreenBinding

class SplashScreen : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPref = getSharedPreferences("onboarding_prefs", MODE_PRIVATE)
        val isOnboardingDone = sharedPref.getBoolean("isOnboardingDone", false)

        binding.root.postDelayed({
            if (isOnboardingDone) {
                startActivity(Intent(this, CreateAccountActivity::class.java))
            } else {
                startActivity(Intent(this, OnboardingActivity::class.java))
            }
            finish()
        }, 2000)
    }
}
