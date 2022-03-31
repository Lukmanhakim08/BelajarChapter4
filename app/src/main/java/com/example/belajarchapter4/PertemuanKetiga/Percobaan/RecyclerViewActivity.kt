package com.example.belajarchapter4.PertemuanKetiga.Percobaan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.belajarchapter4.R
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val datadiri = arrayListOf(
            ProfilClass(R.drawable.gambar,"Lukman", "Probolinggo", "081217951141"),
            ProfilClass(R.drawable.gambar,"Lisa", "Malang", "71971893791"),
            ProfilClass(R.drawable.gambar,"Naufal", "Surabaya", "24533646"),
            ProfilClass(R.drawable.gambar,"Patra", "Jember", "4235364757"),
            ProfilClass(R.drawable.gambar,"Muhammad", "Sidoparjo", "36456878"),
            ProfilClass(R.drawable.gambar,"Nafis", "Medan", "297982689416"),
        )

        val adap = AdapterProfill(datadiri)
        val layManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_datadiri.layoutManager = layManager
        rv_datadiri.adapter = adap
    }
}