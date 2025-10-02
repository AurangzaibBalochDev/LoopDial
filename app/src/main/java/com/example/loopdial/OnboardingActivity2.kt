package com.example.loopdial

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class OnboardingActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding2)

        val btnNext: View = findViewById(R.id.btnNext)
        val btnSkip: Button = findViewById(R.id.btnSkip)
        val btnBack: ImageView = findViewById(R.id.btnBack)

        btnNext.setOnClickListener {
            startActivity(Intent(this, OnboardingActivity3::class.java))
            finish()
        }

        btnSkip.setOnClickListener {
            startActivity(Intent(this, CreateAccountActivity::class.java))
            finish()
        }

        btnBack.setOnClickListener {
            startActivity(Intent(this, OnboardingActivity1::class.java))
            finish()
        }
    }
}
