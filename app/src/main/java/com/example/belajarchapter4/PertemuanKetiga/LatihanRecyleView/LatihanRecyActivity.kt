package com.example.belajarchapter4.PertemuanKetiga.LatihanRecyleView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.belajarchapter4.PertemuanKetiga.Percobaan.AdapterProfill
import com.example.belajarchapter4.PertemuanKetiga.Percobaan.ProfilClass
import com.example.belajarchapter4.R
import kotlinx.android.synthetic.main.activity_latihan_recy.*
import kotlinx.android.synthetic.main.activity_recycler_view.*

class LatihanRecyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_recy)

        val datadiri = arrayListOf(
            DataTugas(R.drawable.binar,"Binar Academy", "Binar Academy", "Eduction", "47", "13MB", "1K"),
            DataTugas(R.drawable.binardu,"Binar X", "Academy", "Eduction", "4.5", "9.8MB", "5K+"),
            DataTugas(R.drawable.binarti,"Power", "Power Academy", "Eduction", "4.5", "9.8MB", "1M+"),
            DataTugas(R.drawable.binar,"Binar Academy", "Binar Academy", "Eduction", "47", "13MB", "1K"),
            DataTugas(R.drawable.binardu,"Binar X", "Academy", "Eduction", "4.5", "9.8MB", "5K+"),
            DataTugas(R.drawable.binarti,"Power", "Power Academy", "Eduction", "4.5", "9.8MB", "1M+"),
            DataTugas(R.drawable.binar,"Binar Academy", "Binar Academy", "Eduction", "47", "13MB", "1K"),
            DataTugas(R.drawable.binardu,"Binar X", "Academy", "Eduction", "4.5", "9.8MB", "5K+"),
            DataTugas(R.drawable.binarti,"Power", "Power Academy", "Eduction", "4.5", "9.8MB", "1M+"),
        )

        val adap = AdapterTugas(datadiri)
        val layManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_tugas.layoutManager = layManager
        rv_tugas.adapter = adap
    }
}