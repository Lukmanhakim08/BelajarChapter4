package com.example.belajarchapter4.PertemuanKedua.LatihanSatu

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.belajarchapter4.R
import kotlinx.android.synthetic.main.activity_alert_dialog.*
import kotlinx.android.synthetic.main.activity_latihan_satu.*

class LatihanSatuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_satu)

        btn_jumlahstandar.setOnClickListener {
            val angkasatu = edt_angkasatu.text.toString().toInt()
            val angkadua = edt_angkadua.text.toString().toInt()
            val hasil = angkasatu + angkadua
            AlertDialog.Builder(this)
                .setTitle("Penjumlahan")
                .setMessage("Hasil penjumlahan dari $angkasatu + $angkadua = $hasil")
                .setCancelable(true)
                .setIcon(R.drawable.ic_android_black_24dp)
                .show()
        }


        btn_jumlah.setOnClickListener {
            val angkasatu = edt_angkasatu.text.toString().toInt()
            val angkadua = edt_angkadua.text.toString().toInt()
            val hasil = angkasatu + angkadua
            val dialog = AlertDialog.Builder(this)
            val ab = dialog.create()
            dialog.setTitle("Penjumlahan")
            dialog.setMessage("Hasil penjumlahan dari $angkasatu + $angkadua = $hasil")
            dialog.setCancelable(false)
            dialog.setNeutralButton("Dismiss"){ dialogInterface: DialogInterface, i: Int ->
                //action yang akan terjadi ketika klik Tidak
                ab.dismiss()
//                    Toast.makeText(this,"Tidak jadi di hapus", Toast.LENGTH_LONG).show()
            }
            dialog.show()
        }

    }
}