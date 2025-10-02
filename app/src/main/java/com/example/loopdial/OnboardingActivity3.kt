package com.example.loopdial

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class OnboardingActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding3)

        val btnGetStarted: View = findViewById(R.id.btnGetStarted)
        val btnSkip: Button = findViewById(R.id.btnSkip)
        val btnBack: ImageView = findViewById(R.id.btnBack)

        btnGetStarted.setOnClickListener {
            val sharedPref = getSharedPreferences("onboarding_prefs", MODE_PRIVATE).edit()
            sharedPref.putBoolean("isOnboardingDone", true)
            sharedPref.apply()

            startActivity(Intent(this, CreateAccountActivity::class.java))
            finish()
        }

        btnSkip.setOnClickListener {
            val sharedPref = getSharedPreferences("onboarding_prefs", MODE_PRIVATE).edit()
            sharedPref.putBoolean("isOnboardingDone", true)
            sharedPref.apply()

            startActivity(Intent(this, CreateAccountActivity::class.java))
            finish()
        }

        btnBack.setOnClickListener {
            startActivity(Intent(this, OnboardingActivity2::class.java))
            finish()
        }
    }
}
