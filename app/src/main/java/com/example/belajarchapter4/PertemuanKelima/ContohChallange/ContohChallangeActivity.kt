package com.example.belajarchapter4.PertemuanKelima.ContohChallange

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.belajarchapter4.R

class ContohChallangeActivity : AppCompatActivity() {
    private lateinit var sf : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contoh_challange)

        sf = getSharedPreferences("kelima", Context.MODE_PRIVATE)
    }
}