package com.example.belajarchapter4.PertemuanKeempat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.belajarchapter4.PertemuanKeempat.ContohSharedP.ContohSharedActivity
import com.example.belajarchapter4.PertemuanKeempat.TugasPertemuanKeempat.HalLoginActivity
import com.example.belajarchapter4.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_pertemuan_keempat.*

class PertemuanKeempatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pertemuan_keempat)


        btn_contoh.setOnClickListener {
            val contoh = Intent(this, ContohSharedActivity::class.java)
            startActivity(contoh)
        }

        btn_sf.setOnClickListener {
            val contoh = Intent(this, MainSFActivity::class.java)
            startActivity(contoh)
        }

        btn_tugaskeempat.setOnClickListener {
            val tugas = Intent(this, HalLoginActivity::class.java)
            startActivity(tugas)
        }
    }
}