package com.example.pet

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.pet.databinding.ActivityPlayerBottomBinding

class PlayerBottom : AppCompatActivity() {

    private lateinit var binding: ActivityPlayerBottomBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlayerBottomBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

}