package com.example.belajarchapter4.PertemuanKelima.ContohChallange

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.belajarchapter4.R
import kotlinx.android.synthetic.main.fragment_login_challange.*
import kotlinx.android.synthetic.main.fragment_login_challange.btn_login

class LoginChallangeFragment : Fragment() {

    private lateinit var sf : SharedPreferences

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login_challange, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if(requireContext().getSharedPreferences("register", Context.MODE_PRIVATE).contains("USERNAME")){
            Navigation.findNavController(view).navigate(R.id.homeFragment)
        }
        sf = requireContext().getSharedPreferences("register", Context.MODE_PRIVATE)
        val getnomor = sf.getString("Nomor", "")
        val getusernama = sf.getString("Username", "")
        val getemail = sf.getString("Email", "")
        val getpass = sf.getString("Password", "")

        btn_login.setOnClickListener {
            //langkah memasukkan data ke sharePrences
            val username = input_username.text.toString()
            val password = inp_password.text.toString()

            if(username.isEmpty()|| password.isEmpty()){
                Toast.makeText(requireContext(), "Username dan Password Salah", Toast.LENGTH_LONG).show()
            }
            if(username == getusernama || password == getpass ){
                val sv = sf.edit()
                sv.putString("USERNAME", username)
                sv.putString("PASSWORD", password)
                sv.apply()
                Navigation.findNavController(view).navigate(R.id.homeFragment)
                Toast.makeText(requireContext(), "Login Berhasil", Toast.LENGTH_LONG).show()
            }
        }

        regiter.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.registerchallangeFragment)
        }
    }

}