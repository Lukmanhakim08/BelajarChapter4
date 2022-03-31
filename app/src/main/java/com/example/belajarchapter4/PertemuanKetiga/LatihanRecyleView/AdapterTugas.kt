package com.example.belajarchapter4.PertemuanKetiga.LatihanRecyleView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarchapter4.PertemuanKetiga.Percobaan.AdapterProfill
import com.example.belajarchapter4.PertemuanKetiga.Percobaan.ProfilClass
import com.example.belajarchapter4.R
import kotlinx.android.synthetic.main.item_recycler.view.*
import kotlinx.android.synthetic.main.item_recycler.view.img_gambar
import kotlinx.android.synthetic.main.item_recytugas.view.*

class AdapterTugas(val listtugas : ArrayList<DataTugas>) : RecyclerView.Adapter<AdapterTugas.ViewHolder>() {

    class ViewHolder(layout: View) : RecyclerView.ViewHolder(layout) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.item_recytugas, parent, false)
        return AdapterTugas.ViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.itemView.img_gambar.setImageResource(listtugas[position].img)
        holder.itemView.text_nametugas.text = listtugas[position].name
        holder.itemView.text_judul.text = listtugas[position].judul
        holder.itemView.text_materi.text = listtugas[position].materi
        holder.itemView.text_rating.text = listtugas[position].rat
        holder.itemView.text_size.text = listtugas[position].ukuran
        holder.itemView.text_surc.text = listtugas[position].sucr
    }

    override fun getItemCount(): Int {
        return listtugas.size
    }

}