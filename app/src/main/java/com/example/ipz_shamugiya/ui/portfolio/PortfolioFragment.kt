package com.example.ipz_shamugiya.ui.portfolio

import android.R
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ipz_shamugiya.databinding.FragmentPortfolioBinding
import com.example.ipz_shamugiya.MainActivity


class PortfolioFragment : Fragment() {
    private var _binding: FragmentPortfolioBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentPortfolioBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.portfolioUrlBtn.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://portfolio.rgsu.net/portfolio/p_105257.html")
            startActivity(intent)
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}