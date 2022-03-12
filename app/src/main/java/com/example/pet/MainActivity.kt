package com.example.pet

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.pet.Fragment.FavoriteFragment
import com.example.pet.Fragment.PlayerFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import meow.bottomnavigation.MeowBottomNavigation
import java.util.function.Function

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavig: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavig = findViewById(R.id.bottomNavigation)
        bottomNavig.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

    }

    private var mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener {
        MenuItem ->
        when (MenuItem.itemId) {
            R.id.home -> {
                supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, PlayerFragment.newInstance()).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.likes -> {
                supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, FavoriteFragment.newInstance()).commit()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }


}