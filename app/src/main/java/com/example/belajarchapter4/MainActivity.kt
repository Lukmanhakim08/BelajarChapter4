package com.example.belajarchapter4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.belajarchapter4.PertemuanPertama.PertamaActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_pertama.setOnClickListener {
            val intent = Intent(this, PertamaActivity::class.java)
            startActivity(intent)
        }
    }
}