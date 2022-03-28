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
import kotlinx.android.synthetic.main.fragment_scr_satu.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_toasnama.setOnClickListener {
            val nama = edt_inputnama.text.toString()
            Toast.makeText(requireContext(), "Selamat Datang $nama", Toast.LENGTH_LONG).show()
            Navigation.findNavController(view).navigate(R.id.snackbarFragment)
        }

        btn_snackname.setOnClickListener {
            Snackbar.make(it, "Ini Snackbar", Snackbar.LENGTH_INDEFINITE)
                .setAction("MOVE"){
                    Toast.makeText(requireContext(),"Selamat Datang Di halaman SnackBar", Toast.LENGTH_LONG).show()
                    Navigation.findNavController(view).navigate(R.id.snackbarFragment)
                }
                .show()
        }
    }
}