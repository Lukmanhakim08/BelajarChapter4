package com.example.belajarchapter4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.belajarchapter4.PertemuanKedua.AlertDialogActivity
import com.example.belajarchapter4.PertemuanKeempat.PertemuanKeempatActivity
import com.example.belajarchapter4.PertemuanKetiga.PertemuanKetigaViewActivity
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

        btn_kedua.setOnClickListener {
            val pertemuan = Intent(this, AlertDialogActivity::class.java)
            startActivity(pertemuan)
        }

        btn_ketiga.setOnClickListener {
            val tiga = Intent(this, PertemuanKetigaViewActivity::class.java)
            startActivity(tiga)
        }

        btn_keempat.setOnClickListener {
            val empat = Intent(this, PertemuanKeempatActivity::class.java)
            startActivity(empat)
        }

    }
}