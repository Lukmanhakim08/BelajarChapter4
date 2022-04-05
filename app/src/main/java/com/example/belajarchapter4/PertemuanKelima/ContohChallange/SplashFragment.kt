package com.example.belajarchapter4.PertemuanKelima.ContohChallange

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.belajarchapter4.PertemuanKeempat.TugasPertemuanKeempat.HalLoginActivity
import com.example.belajarchapter4.R

class SplashFragment : Fragment() {

    //Deklarasi variabel timer Splash Screen muncul
    private val SPLASH_TIME_OUT:Long = 3000 // delay 3 detik
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //kode untuk menjalankan splash screen setelah timer splash screen habis
        Handler().postDelayed({
            Navigation.findNavController(view).navigate(R.id.loginChallangeFragment)
        }, SPLASH_TIME_OUT)
    }

}