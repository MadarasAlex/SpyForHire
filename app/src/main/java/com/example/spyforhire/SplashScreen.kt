package com.example.spyforhire

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.spyforhire.ui.login.LoginActivity
import java.lang.Thread.sleep

class SplashScreen : AppCompatActivity() {
    private val SPLASH_TIME_OUT: Long = 1000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        Handler().postDelayed({
            val intent = Intent(this, LoginActivity::class.java)

            startActivity(intent)

        }, SPLASH_TIME_OUT)
    }
}