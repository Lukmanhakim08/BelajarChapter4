package com.example.belajarchapter4.PertemuanKelima.ContohChallange

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.belajarchapter4.R
import kotlinx.android.synthetic.main.fragment_registerchallange.*

class RegisterchallangeFragment : Fragment() {
    private lateinit var prefs : SharedPreferences
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_registerchallange, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if(requireContext().getSharedPreferences("register", Context.MODE_PRIVATE).contains("Nomor")){
            Navigation.findNavController(view).navigate(R.id.loginChallangeFragment)
        }
        if (requireContext().getSharedPreferences("register", Context.MODE_PRIVATE).contains("Username")){
            Navigation.findNavController(view).navigate(R.id.loginChallangeFragment)
        }
        if (requireContext().getSharedPreferences("register", Context.MODE_PRIVATE).contains("email")){
            Navigation.findNavController(view).navigate(R.id.loginChallangeFragment)
        }
        if (requireContext().getSharedPreferences("register", Context.MODE_PRIVATE).contains("password")){
            Navigation.findNavController(view).navigate(R.id.loginChallangeFragment)
        }
        prefs = requireContext().getSharedPreferences("register", Context.MODE_PRIVATE)

        btn_register.setOnClickListener {
            val nomor = edt_nohp.text.toString()
            val username = edt_username.text.toString()
            val email = edt_email.text.toString()
            val password = edt_password.text.toString()
            val konfirmasi = edt_konfirmasi.text.toString()
            val sv = prefs.edit()
            sv.putString("Nomor", nomor)
            sv.putString("Username", username)
            sv.putString("Email", email)
            sv.putString("Password", password)
            sv.putString("Konfimasi", konfirmasi)
            sv.apply()
            Toast.makeText(requireContext(), "Register Berhasil", Toast.LENGTH_LONG).show()
            Navigation.findNavController(view).navigate(R.id.loginChallangeFragment)
        }
    }

}