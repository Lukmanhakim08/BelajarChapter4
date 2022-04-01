package com.example.belajarchapter4.PertemuanKeempat

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.belajarchapter4.R
import kotlinx.android.synthetic.main.activity_main_sfactivity.*

class MainSFActivity : AppCompatActivity() {

    //membuat variabel globa
    lateinit var prefs : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_sfactivity)

        if(getSharedPreferences("contoh", Context.MODE_PRIVATE).contains("NAMA")){
            startActivity(Intent(this, MainSF2Activity::class.java))
            finish()
        }

        //Initialen isi dari variabel global
        prefs = getSharedPreferences("contoh", Context.MODE_PRIVATE)

        SharedPrefExample()
    }

    fun SharedPrefExample(){
        btn_simpan.setOnClickListener {
            //langkah memasukkan data ke sharePrences
            val datanama = enter_nama.text.toString()
            val sv = prefs.edit()
            sv.putString("NAMA", datanama)
            sv.apply()
            startActivity(Intent(this, MainSF2Activity::class.java))
            finish()
        }
    }
}