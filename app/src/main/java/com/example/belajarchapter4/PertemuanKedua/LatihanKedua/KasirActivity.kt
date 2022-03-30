package com.example.belajarchapter4.PertemuanKedua.LatihanKedua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.belajarchapter4.PertemuanKedua.alertFragment.FragmentFragment
import com.example.belajarchapter4.R
import kotlinx.android.synthetic.main.activity_alert_dialog.*
import kotlinx.android.synthetic.main.activity_kasir.*
import kotlinx.android.synthetic.main.custom_kasir.*
import kotlinx.android.synthetic.main.custom_kasir.view.*
import kotlinx.android.synthetic.main.custum_dialog.view.*

class KasirActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kasir)

        btn_custemlayout.setOnClickListener {
            val nmbarang = edt_nmbarang.text.toString()
            val jmbarang = edt_jumlah.text.toString().toInt()
            val hrgbarang = edt_hargabrng.text.toString().toInt()
            val total = jmbarang * hrgbarang
            val ab = AlertDialog.Builder(this)
                .create()
                ab.setTitle("Total Belanja")
                ab.setMessage("= $total")
            val custom = LayoutInflater.from(this).inflate(R.layout.custom_kasir, null, false)
                ab.setView(custom)
                ab.create()
            custom.btn_bayar.setOnClickListener {
                val bayar = custom.edt_bayar.text.toString().toInt()
                val kembalian = bayar-total
                out_barang.text = "Nama Barang : "+nmbarang
                out_jumlah.text = "Jumlah Barang : " + jmbarang.toString()
                out_harga.text = "Harga barang : "+hrgbarang.toString()
                out_total.text = "Total : "+total.toString()
                out_kembalian.text = "Kembalian : "+kembalian.toString()

                ab.dismiss()
            }
            ab.show()
        }

        btn_custemfragment.setOnClickListener {
            AlertDialogFragment().show(supportFragmentManager,"Fragment")
        }


    }
}