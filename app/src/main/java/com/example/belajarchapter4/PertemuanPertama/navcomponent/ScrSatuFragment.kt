package com.example.belajarchapter4.PertemuanPertama.navcomponent

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.belajarchapter4.PertemuanPertama.DashboarActivity
import com.example.belajarchapter4.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_pertama.*
import kotlinx.android.synthetic.main.fragment_scr_satu.*
import kotlinx.android.synthetic.main.fragment_scr_satu.btn_snack

class ScrSatuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_scr_satu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_to.setOnClickListener {
            Toast.makeText(requireContext(), "Halaman Toas", Toast.LENGTH_LONG).show()
        }

        btn_snack.setOnClickListener {
            Snackbar.make(it, "Ini Snackbar", Snackbar.LENGTH_INDEFINITE)
                .setAction("Scren Dua"){
                    Navigation.findNavController(view).navigate(R.id.scrDuaFragment)
                }
                .show()
        }
    }

}