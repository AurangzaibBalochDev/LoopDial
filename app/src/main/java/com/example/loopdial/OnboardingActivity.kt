package com.example.loopdial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.adapters.OnboardingPagerAdapter
import com.example.loopdial.databinding.ActivityOnboardingBinding

class OnboardingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOnboardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = OnboardingPagerAdapter(this)
        binding.viewPager.adapter = adapter

        binding.dotsIndicator.attachTo(binding.viewPager)
    }

    fun goToPage(index: Int) {
        binding.viewPager.currentItem = index
    }
}
