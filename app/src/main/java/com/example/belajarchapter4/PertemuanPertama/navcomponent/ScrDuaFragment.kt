package com.example.belajarchapter4.PertemuanPertama.navcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.belajarchapter4.R
import kotlinx.android.synthetic.main.fragment_scr_dua.*

class ScrDuaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_scr_dua, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_backtoas.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.scrSatuFragment)
        }
    }
}