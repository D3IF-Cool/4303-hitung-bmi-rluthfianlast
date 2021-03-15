package org.d3if0084.hitungbmi.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import org.d3if0084.hitungbmi.R
import org.d3if0084.hitungbmi.databinding.FragmentHitungBinding

class HitungFragment : Fragment() {
    private lateinit var binding: FragmentHitungBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentHitungBinding.inflate(
            layoutInflater, container, false)

        binding.button.setOnClickListener { hitungBmi() }
        binding.saranButton.setOnClickListener { view: View ->
            view.findNavController().navigate(
                R.id.action_hitungFragment_to_saranFragment
            )
        }
        return binding.root
    }

    private fun hitungBmi(){

        binding.saranButton.visibility = View.VISIBLE

    }

}