package com.example.belajarchapter4.PertemuanKedua.alertFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.belajarchapter4.R
import kotlinx.android.synthetic.main.fragment_fragment.*

class FragmentFragment : DialogFragment(){
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tb_proses.setOnClickListener {
            val umur = edt_umurku.text.toString()
            Toast.makeText(requireContext(),"Umur anda $umur", Toast.LENGTH_LONG).show()
                dismiss()
        }
    }


}