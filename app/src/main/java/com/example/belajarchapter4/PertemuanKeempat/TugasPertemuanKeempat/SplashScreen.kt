package com.example.belajarchapter4.PertemuanKeempat.TugasPertemuanKeempat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.belajarchapter4.R

class SplashScreen : AppCompatActivity() {
    //Deklarasi variabel timer Splash Screen muncul
    private val SPLASH_TIME_OUT:Long = 3000 // delay 3 detik
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        //kode untuk menjalankan splash screen setelah timer splash screen habis
        Handler().postDelayed({
            startActivity(Intent(this, HalLoginActivity::class.java))
        }, SPLASH_TIME_OUT)
    }
}