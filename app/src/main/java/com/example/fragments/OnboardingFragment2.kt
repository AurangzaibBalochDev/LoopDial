package com.example.loopdial

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment

class OnboardingFragment2 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_onboarding2, container, false)

        val btnNext: Button = view.findViewById(R.id.btnNext)
        val btnSkip: Button = view.findViewById(R.id.btnSkip)
        val btnBack: ImageView = view.findViewById(R.id.btnBack)

        btnNext.setOnClickListener {
            (activity as OnboardingActivity).goToPage(2)
        }

        btnSkip.setOnClickListener {
            startActivity(Intent(requireContext(), CreateAccountActivity::class.java))
            activity?.finish()
        }

        btnBack.setOnClickListener {
            (activity as OnboardingActivity).goToPage(0)
        }

        return view
    }
}
