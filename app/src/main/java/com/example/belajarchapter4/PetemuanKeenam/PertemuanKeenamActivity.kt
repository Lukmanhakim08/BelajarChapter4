package com.example.belajarchapter4.PetemuanKeenam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.belajarchapter4.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_pertemuan_keenam.*

class PertemuanKeenamActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pertemuan_keenam)


        btn_rom.setOnClickListener {
            val room = Intent(this, PertemuanKeenamActivity::class.java)
            startActivity(room)
        }
    }
}