package com.example.myscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import com.airbnb.lottie.LottieAnimationView
import kotlinx.coroutines.delay


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var anim = findViewById<LottieAnimationView>(R.id.AnimationView)

        Handler(Looper.getMainLooper()).postDelayed(Runnable{
            anim.visibility = View.VISIBLE
            anim.playAnimation()
        },  2000)
        anim.setOnClickListener{
            anim.playAnimation()
        }
    }
}