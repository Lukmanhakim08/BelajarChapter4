package com.example.belajarchapter4.PertemuanKeempat.TugasPertemuanKeempat

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.belajarchapter4.PertemuanKeempat.MainSFActivity
import com.example.belajarchapter4.R
import kotlinx.android.synthetic.main.activity_dashboard.*
import kotlinx.android.synthetic.main.activity_main_sf2.*
import kotlinx.android.synthetic.main.custum_dialog.view.*
import kotlinx.android.synthetic.main.logout_layout.view.*

class DashboardActivity : AppCompatActivity() {
    lateinit var sf : SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        //Initialen isi dari variabel global
        sf = getSharedPreferences("login", Context.MODE_PRIVATE)
        val getusername = sf.getString("USERNAME", "")
        text_username.setText(" Hallo, $getusername")

        btn_keluar.setOnClickListener {
            val custumdialog = LayoutInflater.from(this).inflate(R.layout.logout_layout, null, false)
            val ab = AlertDialog.Builder(this)
                ab.setTitle("Apakah anda yakin logout ?")
                .setCancelable(false)
                .setView(custumdialog)
                .create()
            custumdialog.btn_ya.setOnClickListener {
                val logoutsf = sf.edit()
                logoutsf.clear()
                logoutsf.apply()
                startActivity(Intent(this, HalLoginActivity::class.java))
                Toast.makeText(this, "Berhasil Logout", Toast.LENGTH_LONG).show()
                finish()
            }
            custumdialog.btn_tidak.setOnClickListener {
                startActivity(Intent(this, DashboardActivity::class.java))
                Toast.makeText(this, "Tidak jadi logout", Toast.LENGTH_LONG).show()
                finish()
            }
            ab.show()
        }
    }
}