package com.example.belajarchapter4.PertemuanKedua.LatihanKedua

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import com.example.belajarchapter4.R
import kotlinx.android.synthetic.main.activity_kasir.*
import kotlinx.android.synthetic.main.custom_kasir.*
import kotlinx.android.synthetic.main.custom_kasir.view.*
import kotlinx.android.synthetic.main.fragment_dialog.*
import kotlinx.android.synthetic.main.activity_kasir.edt_jumlah as edt_jumlah1
import kotlinx.android.synthetic.main.activity_kasir.edt_nmbarang as edt_nmbarang1
import kotlinx.android.synthetic.main.activity_kasir.out_jumlah as out_jumlah1
import kotlinx.android.synthetic.main.activity_kasir.out_total as out_total1
import kotlinx.android.synthetic.main.fragment_dialog.edt_hargabrng as edt_hargabrng1
import kotlinx.android.synthetic.main.fragment_dialog.out_barang as out_barang1
import kotlinx.android.synthetic.main.fragment_dialog.out_harga as out_harga1
import kotlinx.android.synthetic.main.fragment_dialog.out_kembalian as out_kembalian1

class AlertDialogFragment : DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dialog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_prosesfragment.setOnClickListener {
            val nmbarang = edt_nmbarang.text.toString()
            val jmbarang = edt_jumlah.text.toString().toInt()
            val hrgbarang = edt_hargabrng.text.toString().toInt()
            val total = jmbarang*hrgbarang
            val ab = AlertDialog.Builder(requireContext())
                .create()
            ab.setTitle("Total Belanja")
            ab.setMessage("= $total")
            val custom = LayoutInflater.from(requireContext()).inflate(R.layout.custom_kasir, null, false)
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
    }
}