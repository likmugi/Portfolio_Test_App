package com.example.ipz_shamugiya.ui.contacts

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.ipz_shamugiya.databinding.FragmentContactsBinding

class ContactsFragment : Fragment() {
    private var _binding: FragmentContactsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentContactsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.gmailButton.setOnClickListener{
            val mailIntent = Intent(
                Intent.ACTION_SENDTO, Uri.fromParts(
                    "mailto",
                    "shelley.bass.li@gmail.com", null
                )
            )
            mailIntent.putExtra(Intent.EXTRA_TEXT, "Здравствуйте! Увидели ваше портфолио..")
            startActivity(mailIntent)
        }

        binding.vkButton.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://vk.com/sham.lika")
            startActivity(intent)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}