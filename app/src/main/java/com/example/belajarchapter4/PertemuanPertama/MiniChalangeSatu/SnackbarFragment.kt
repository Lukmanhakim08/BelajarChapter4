package com.example.belajarchapter4.PertemuanPertama.MiniChalangeSatu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.belajarchapter4.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_snackbar.*

class SnackbarFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_snackbar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_backkembali.setOnClickListener {
            Snackbar.make(it, "Kembali Ke Home", Snackbar.LENGTH_INDEFINITE)
                .setAction("Home"){
                    Toast.makeText(requireContext(),"Selamat Datang Di halaman Home", Toast.LENGTH_LONG).show()
                    Navigation.findNavController(view).navigate(R.id.homeFragment)
                }
                .show()
        }
    }
}