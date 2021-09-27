package com.example.ipz_shamugiya.ui.aboutMe

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.ipz_shamugiya.R
import com.example.ipz_shamugiya.databinding.FragmentAboutMeBinding
import com.example.ipz_shamugiya.databinding.FragmentUniversityBinding


class AboutMeFragment : Fragment() {

    private var _binding: FragmentAboutMeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentAboutMeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}