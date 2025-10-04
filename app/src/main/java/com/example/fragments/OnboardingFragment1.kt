package com.example.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.auth.CreateAccountActivity
import com.example.loopdial.OnboardingActivity
import com.example.loopdial.R

class OnboardingFragment1 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_onboarding1, container, false)

        val btnNext: Button = view.findViewById(R.id.btnNext)
        val btnSkip: Button = view.findViewById(R.id.btnSkip)

        btnNext.setOnClickListener {
            (activity as OnboardingActivity).goToPage(1)
        }

        btnSkip.setOnClickListener {
            startActivity(Intent(requireContext(), CreateAccountActivity::class.java))
            activity?.finish()
        }

        return view
    }
}
