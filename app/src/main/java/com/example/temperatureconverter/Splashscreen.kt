package com.example.temperatureconverter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class Splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()
        val image = findViewById<ImageView>(R.id.imageView1)
        val text1 = findViewById<TextView>(R.id.textView)
        val text2 = findViewById<TextView>(R.id.textView1)
        val topanim =AnimationUtils.loadAnimation(this, R.anim.top_animation)
        val botanim =AnimationUtils.loadAnimation(this, R.anim.bottom_animation)
         image.startAnimation(botanim)
        text1.startAnimation(topanim)
        text2.startAnimation(topanim)
        Handler().postDelayed(
            {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            },2500
        )
    }
}