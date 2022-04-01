package com.example.belajarchapter4.PertemuanKeempat.ContohSharedP

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.belajarchapter4.R
import kotlinx.android.synthetic.main.activity_contoh_shared.*

class ContohSharedActivity : AppCompatActivity() {

    lateinit var prefs : SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contoh_shared)
        //Initialen isi dari variabel global
        prefs = getSharedPreferences("contoh", Context.MODE_PRIVATE)
        btn_save.setOnClickListener {
            //langkah memasukkan data ke sharePrences
            val id = edt_idnam.text.toString()
            val namasap = edt_namasa.text.toString()
            val sv = prefs.edit()
            sv.putString("ID", id)
            sv.putString("NAMA", namasap)
            sv.apply()
            Toast.makeText(this, "Data Sukses", Toast.LENGTH_LONG).show()
        }

        btn_view.setOnClickListener {
            val getid = prefs.getString("ID", "")
            val getNMS = prefs.getString("NAMA", "")
            text_idmu.text = getid.toString()
            text_namakus.text = getNMS.toString()
        }

        btn_clear.setOnClickListener {
            val sv = prefs.edit()
            sv.clear()
            sv.apply()
            text_idmu.setText("")
            text_namakus.setText("")
            Toast.makeText(this, "Data Clear", Toast.LENGTH_SHORT).show()
        }
    }
}