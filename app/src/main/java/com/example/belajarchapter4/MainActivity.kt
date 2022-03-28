package com.example.belajarchapter4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.belajarchapter4.PertemuanPertama.MiniChalangeSatu.PenampungActivity
import com.example.belajarchapter4.PertemuanPertama.PertamaActivity
import com.example.belajarchapter4.PertemuanPertama.navcomponent.NavComponetActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_pertama.setOnClickListener {
            val intent = Intent(this, PertamaActivity::class.java)
            startActivity(intent)
        }

        btn_navi.setOnClickListener {
            val nav = Intent(this, NavComponetActivity::class.java)
            startActivity(nav)
        }

        btn_latihannavi.setOnClickListener {
            val latihan = Intent(this, PenampungActivity::class.java)
            startActivity(latihan)
        }
    }
}