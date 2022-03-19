package com.example.pet.Fragment.FavoriteManager

import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pet.R
import com.example.pet.databinding.FragmentFavoriteBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

class FavoriteFragment : Fragment() {

    private lateinit var binding: FragmentFavoriteBinding
    private lateinit var playerMedia: MediaPlayer
    private var song: ArrayList<Int> = ArrayList()
    private var indexSong = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFavoriteBinding.inflate(requireActivity().layoutInflater)
        var view: View = binding.root

        binding.buttonPlayListFavorite.setOnClickListener {
        }

        binding.next.setOnClickListener {
            nextMusic()
        }

        binding.prev.setOnClickListener {
            prevMusic()
        }

        binding.pause.setOnClickListener{
            startMusic()
        }

        addMusic()
        return view
    }


    fun addMusic () {

        song.add(0, R.raw.step)
        song.add(1, R.raw.thunder)
        song.add(2, R.raw.monster)
        song.add(3, R.raw.kiss)

        playerMedia = MediaPlayer.create(requireContext(), song.get(indexSong))
    }

    fun startMusic(){

        if (playerMedia != null && playerMedia.isPlaying){
            playerMedia.pause()
        } else {
            playerMedia.start()
        }

    }

    fun nextMusic(){

        if (playerMedia.isPlaying) {
            playerMedia.stop()
        }

        if (song.size-1 > indexSong)
            indexSong++
        else
            indexSong = 0

        playerMedia = MediaPlayer.create(requireContext(), song.get(indexSong))
        playerMedia.start()
    }

    fun prevMusic () {

        if (playerMedia.isPlaying){
            playerMedia.stop()
        }

        if (indexSong <= 0)
            indexSong = song.size - 1
        else if (indexSong < song.size-1)
            indexSong--

        playerMedia = MediaPlayer.create(requireContext(), song.get(indexSong))
        playerMedia.start()
    }


    private fun adapterFavorite(){
        var listPlaylistFavorite = ArrayList<String>()
        var favoriteAdapter = FavoriteAdapter(requireContext(), listPlaylistFavorite)
        var lManager : RecyclerView.LayoutManager = LinearLayoutManager(requireContext(),
            RecyclerView.VERTICAL, false)

//        binding.recycleWishList.layoutManager = lManager
//        binding.recycleWishList.adapter = favoriteAdapter
    }

    companion object {

        @JvmStatic
        fun newInstance() = FavoriteFragment()
    }
}