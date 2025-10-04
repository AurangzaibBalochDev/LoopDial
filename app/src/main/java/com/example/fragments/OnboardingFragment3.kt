package com.example.fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.auth.CreateAccountActivity
import androidx.core.content.edit
import com.example.loopdial.OnboardingActivity
import com.example.loopdial.R

class OnboardingFragment3 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_onboarding3, container, false)

        val btnGetStarted: Button = view.findViewById(R.id.btnGetStarted)
        val btnSkip: Button = view.findViewById(R.id.btnSkip)
        val btnBack: ImageView = view.findViewById(R.id.btnBack)

        btnGetStarted.setOnClickListener {
            requireActivity().getSharedPreferences(
                "onboarding_prefs",
                Context.MODE_PRIVATE
            ).edit {
                putBoolean("isOnboardingDone", true)
            }

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
