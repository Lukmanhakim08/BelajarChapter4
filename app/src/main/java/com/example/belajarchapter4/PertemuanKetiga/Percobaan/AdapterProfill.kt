package com.example.belajarchapter4.PertemuanKetiga.Percobaan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarchapter4.R
import kotlinx.android.synthetic.main.item_recycler.view.*

class AdapterProfill(val listdata : ArrayList<ProfilClass>) : RecyclerView.Adapter<AdapterProfill.ViewHolder>() {
    class ViewHolder(layout: View) : RecyclerView.ViewHolder(layout) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler, parent, false)
        return ViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.img_gambar.setImageResource(listdata[position].img)
        holder.itemView.nm_mhs.text = listdata[position].nama
        holder.itemView.text_alamat.text = listdata[position].alamat
        holder.itemView.text_nohp.text = listdata[position].nohp
    }

    override fun getItemCount(): Int {
        return listdata.size
    }


}

