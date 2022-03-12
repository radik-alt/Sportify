package com.example.pet

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PlayerBottom : AppCompatActivity() {

    private lateinit var play: Button
    private lateinit var music: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_bottom)
        startMusic()
        play = findViewById(R.id.play)
        play.setOnClickListener {
            stopMusic()
        }
    }

    fun startMusic () {
        music = MediaPlayer.create(this, R.raw.step)
        music.start()
    }

    fun pauseMusic () {
        if (music != null) {
            music.release()
        }
    }

    fun stopMusic () {
        music.stop()
    }
}