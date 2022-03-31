package com.example.belajarchapter4.PertemuanKetiga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.belajarchapter4.PertemuanKetiga.LatihanRecyleView.LatihanRecyActivity
import com.example.belajarchapter4.PertemuanKetiga.Percobaan.RecyclerViewActivity
import com.example.belajarchapter4.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_pertemuan_ketiga.*

class PertemuanKetigaViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pertemuan_ketiga)

        btn_list.setOnClickListener {
            val pindah = Intent(this, RecyclerViewActivity::class.java)
            startActivity(pindah)
        }

        btn_lthrecy.setOnClickListener {
            val pindah = Intent(this, LatihanRecyActivity::class.java)
            startActivity(pindah)
        }

    }

}