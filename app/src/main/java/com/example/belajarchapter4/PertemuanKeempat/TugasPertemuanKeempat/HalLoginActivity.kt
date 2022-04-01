package com.example.belajarchapter4.PertemuanKeempat.TugasPertemuanKeempat

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.belajarchapter4.PertemuanKeempat.MainSF2Activity
import com.example.belajarchapter4.R
import kotlinx.android.synthetic.main.activity_hal_login.*
import kotlinx.android.synthetic.main.activity_main_sfactivity.*

class HalLoginActivity : AppCompatActivity() {
    //membuat variabel globa
    lateinit var prefs : SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hal_login)

        if(getSharedPreferences("login", Context.MODE_PRIVATE).contains("USERNAME")){
            startActivity(Intent(this, DashboardActivity::class.java))
            finish()
        }
        //Initialen isi dari variabel global
        prefs = getSharedPreferences("login", Context.MODE_PRIVATE)

        btn_login.setOnClickListener {
            //langkah memasukkan data ke sharePrences
            val username = edt_username.text.toString()
            val password = edt_password.text.toString()

            if(username.isEmpty()|| password.isEmpty()){
                Toast.makeText(this, "username dan password salah", Toast.LENGTH_SHORT).show()
            }
            if(username == "lukman"|| password == "admin"){
                val sv = prefs.edit()
                sv.putString("USERNAME", username)
                sv.apply()
                startActivity(Intent(this, DashboardActivity::class.java))
                finish()
                Toast.makeText(this, "Login Sukses", Toast.LENGTH_SHORT).show()
            }
        }
    }
}