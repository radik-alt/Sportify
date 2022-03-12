package com.example.pet.Fragment.FavoriteManager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.pet.R
import com.example.pet.databinding.FragmentFavoriteBinding

class FavoriteFragment : Fragment() {

    private lateinit var binding: FragmentFavoriteBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFavoriteBinding.inflate(requireActivity().layoutInflater)
        var view: View = binding.root

        binding.buttonPlayListFavorite.setOnClickListener {
            Toast.makeText(requireContext(), "Click Clack", Toast.LENGTH_SHORT).show()
        }


        return view
    }

    companion object {

        @JvmStatic
        fun newInstance() = FavoriteFragment()
    }
}