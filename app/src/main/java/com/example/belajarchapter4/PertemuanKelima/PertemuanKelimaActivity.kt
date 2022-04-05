package com.example.belajarchapter4.PertemuanKelima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import com.example.belajarchapter4.PertemuanKelima.ContohChallange.ContohChallangeActivity
import com.example.belajarchapter4.R
import kotlinx.android.synthetic.main.activity_pertemuan_kelima.*

class PertemuanKelimaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pertemuan_kelima)

        btn_contohcha.setOnClickListener {

//            Navigation.findNavController().navigate(R.id.loginChallangeFragment)
            startActivity(Intent(this, ContohChallangeActivity::class.java))
        }
    }
}