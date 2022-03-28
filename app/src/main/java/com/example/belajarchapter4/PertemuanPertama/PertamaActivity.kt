package com.example.belajarchapter4.PertemuanPertama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.belajarchapter4.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_pertama.*

class PertamaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pertama)

        btn_proses.setOnClickListener {
            val nama = edt_nama.text.toString()
            Toast.makeText(this, "Selamat Datang $nama", Toast.LENGTH_LONG).show()
        }

        btn_go.setOnClickListener {
            Snackbar.make(it, "Go", Snackbar.LENGTH_INDEFINITE)
                .setAction("Pindah Dashboard"){
                    val intent = Intent(this, DashboarActivity::class.java)
                    startActivity(intent)
                }
                .show()
        }

        btn_toast.setOnClickListener {
            val data = "Lukman Hakim"
            Toast.makeText(this, "Button Toast : $data", Toast.LENGTH_SHORT).show()
        }

        btn_snack.setOnClickListener {
            Snackbar.make(it, "Ini Snackbar Long", Snackbar.LENGTH_LONG).show()
        }

        btn_snack1.setOnClickListener {
            Snackbar.make(it, "Snackbar", Snackbar.LENGTH_INDEFINITE)
                .setAction("Show Toast"){
                    Toast.makeText(this, "Ini tost dari snackbar dua", Toast.LENGTH_LONG).show()
                }
                .setAction("Show Toast2"){
                    Toast.makeText(this, "Ini tost dari snackbar tiga", Toast.LENGTH_LONG).show()
                }
                .show()
        }

        btn_snack2.setOnClickListener {
            val aa = Snackbar.make(it, "Snackbar", Snackbar.LENGTH_INDEFINITE)
                aa.setAction("DISMISS"){
                    aa.dismiss()
                }
                .show()
        }

    }
}