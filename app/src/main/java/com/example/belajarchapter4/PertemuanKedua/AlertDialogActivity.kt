package com.example.belajarchapter4.PertemuanKedua

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.belajarchapter4.PertemuanKedua.LatihanKedua.KasirActivity
import com.example.belajarchapter4.PertemuanKedua.LatihanSatu.LatihanDuaActivity
import com.example.belajarchapter4.PertemuanKedua.LatihanSatu.LatihanSatuActivity
import com.example.belajarchapter4.PertemuanKedua.alertFragment.FragmentFragment
import com.example.belajarchapter4.R
import kotlinx.android.synthetic.main.activity_alert_dialog.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custum_dialog.*
import kotlinx.android.synthetic.main.custum_dialog.view.*

class AlertDialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)

        btn_alertsatu.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Contoh Alert")
                .setMessage("Contoh pesa dari alert dialog stndar")
                .setCancelable(true)
                .setIcon(R.drawable.ic_android_black_24dp)
                .show()
        }

        btn_alertdua.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Edit Data .. ?")
                .setMessage("Yakin ubah data")
                .setCancelable(false)
                .setPositiveButton("Ya"){ dialogInterface: DialogInterface, i: Int ->
                    //action yang akan terjadi ketika klik ya
                    Toast.makeText(this,"Data anda berhasil di edit", Toast.LENGTH_LONG).show()
                }
                .setNegativeButton("Tidak"){ dialogInterface: DialogInterface, i: Int ->
                    //action yang akan terjadi ketika klik Tidak
                    Toast.makeText(this,"Tidak jadi di hapus", Toast.LENGTH_LONG).show()
                }
                .show()
        }

        btn_alerttiga.setOnClickListener {
           val dialog = AlertDialog.Builder(this)
            val ab = dialog.create()
                dialog.setTitle("Edit Data .. ?")
                dialog.setMessage("Yakin ubah data")
                dialog.setCancelable(false)
                dialog.setPositiveButton("Ya"){ dialogInterface: DialogInterface, i: Int ->
                    //action yang akan terjadi ketika klik ya
                    Toast.makeText(this,"Ya", Toast.LENGTH_LONG).show()
                }
                dialog.setNeutralButton("Dismiss"){ dialogInterface: DialogInterface, i: Int ->
                    //action yang akan terjadi ketika klik Tidak
                    ab.dismiss()
//                    Toast.makeText(this,"Tidak jadi di hapus", Toast.LENGTH_LONG).show()
                }
                dialog.show()
        }

        btn_alertempat.setOnClickListener {
            val custumdialog = LayoutInflater.from(this).inflate(R.layout.custum_dialog, null, false)
            val ab = AlertDialog.Builder(this)
                .setView(custumdialog)
                .create()

            custumdialog.btn_cusomalert.setOnClickListener {
                val name = custumdialog.edt_namaku.text.toString()
                Toast.makeText(this, name, Toast.LENGTH_LONG).show()
                ab.dismiss()
            }
            ab.show()
        }

        btn_alertlima.setOnClickListener {
            FragmentFragment().show(supportFragmentManager,"abc")
        }

        btn_latihanalert.setOnClickListener {
            val pindah = Intent(this, LatihanSatuActivity::class.java)
            startActivity(pindah)
        }

        btn_latihanalert.setOnClickListener {
            val pindah = Intent(this, LatihanSatuActivity::class.java)
            startActivity(pindah)
        }


        btn_latihankedua.setOnClickListener {
            val pindah = Intent(this, KasirActivity::class.java)
            startActivity(pindah)
        }
    }


}