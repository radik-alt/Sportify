package com.example.pet.Fragment

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.pet.R
import com.google.android.material.bottomsheet.BottomSheetDialog


class PlayerFragment : Fragment() {

    private lateinit var music: MediaPlayer
    private lateinit var start: Button
    private lateinit var pause: Button
    private lateinit var stop: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_player, container, false)

        start = view.findViewById(R.id.start)
        pause = view.findViewById(R.id.pause)
        stop = view.findViewById(R.id.stop)

        start.setOnClickListener {
            val viewBottom: View = layoutInflater.inflate(R.layout.activity_player_bottom, null)
            val dialog = BottomSheetDialog(requireActivity())
            dialog.setContentView(viewBottom)
            dialog.show()
        }

        return view
    }

    fun pool () {
        var thread: Thread = Thread()
        thread.run {
            start.setOnClickListener {
                startMusic()
            }

            pause.setOnClickListener {
                pauseMusic()
            }

            stop.setOnClickListener {
                stopMusic()
            }
        }
        thread.start()
    }

    fun startMusic () {
        music = MediaPlayer.create(activity, R.raw.step)
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

    companion object {

        @JvmStatic
        fun newInstance() = PlayerFragment()
    }
}