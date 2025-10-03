package com.example.loopdial

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment

class OnboardingFragment3 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_onboarding3, container, false)

        val btnGetStarted: Button = view.findViewById(R.id.btnGetStarted)
        val btnSkip: Button = view.findViewById(R.id.btnSkip)
        val btnBack: ImageView = view.findViewById(R.id.btnBack)

        btnGetStarted.setOnClickListener {
            val sharedPref = requireActivity().getSharedPreferences("onboarding_prefs", android.content.Context.MODE_PRIVATE).edit()
            sharedPref.putBoolean("isOnboardingDone", true)
            sharedPref.apply()

            startActivity(Intent(requireContext(), CreateAccountActivity::class.java))
            activity?.finish()
        }

        btnSkip.setOnClickListener {
            startActivity(Intent(requireContext(), CreateAccountActivity::class.java))
            activity?.finish()
        }

        btnBack.setOnClickListener {
            (activity as OnboardingActivity).goToPage(1)
        }

        return view
    }
}
