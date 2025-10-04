package com.example.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.fragments.OnboardingFragment1
import com.example.fragments.OnboardingFragment2
import com.example.fragments.OnboardingFragment3

class OnboardingPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> OnboardingFragment1()
            1 -> OnboardingFragment2()
            else -> OnboardingFragment3()
        }
    }
}
