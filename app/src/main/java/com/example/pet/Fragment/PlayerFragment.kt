package com.example.pet.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pet.databinding.FragmentPlayerBinding
import com.example.pet.room.User.AccountRespository
import com.example.pet.room.User.DaoAccount
import com.example.pet.room.User.EntityAccount


class PlayerFragment : Fragment() {

    private lateinit var binding: FragmentPlayerBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPlayerBinding.inflate(requireActivity().layoutInflater)



        return binding.root
    }


    companion object {
        @JvmStatic
        fun newInstance() = PlayerFragment()
    }
}