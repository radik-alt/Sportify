package com.example.pet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        var mHandler : Handler = Handler()
        mHandler.postDelayed(Runnable {
            run {
                val splashIntent = Intent(this, MainActivity::class.java)
                startActivity(splashIntent)
            }
        }, 2000)

    }
}