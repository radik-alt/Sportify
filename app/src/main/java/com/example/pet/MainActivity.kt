package com.example.pet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pet.Fragment.FavoriteManager.FavoriteFragment
import com.example.pet.Fragment.PlayerFragment
import com.example.pet.Fragment.SearchManager.SearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

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
            R.id.account -> {
                Toast.makeText(this, "Этого экрана еще нет!", Toast.LENGTH_SHORT).show()
            }
            R.id.search -> {
                supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, SearchFragment()).commit()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }


}