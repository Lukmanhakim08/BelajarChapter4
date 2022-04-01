package com.example.belajarchapter4.PertemuanKeempat

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.belajarchapter4.R
import kotlinx.android.synthetic.main.activity_main_sf2.*

class MainSF2Activity : AppCompatActivity() {
    lateinit var sf : SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_sf2)
        sf = getSharedPreferences("contoh", Context.MODE_PRIVATE)
        val getnama = sf.getString("NAMA", "")
        get_nama.text = getnama

        Log.i("datanama", getnama.toString())

        btn_logout.setOnClickListener {
            logout()
        }
    }

    fun logout(){
        val logoutsf = sf.edit()
        logoutsf.clear()
        logoutsf.apply()
        startActivity(Intent(this, MainSFActivity::class.java))
        finish()
    }
}