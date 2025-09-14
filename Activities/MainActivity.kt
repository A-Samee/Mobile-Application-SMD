package com.abdulsamee.i221051

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, AccountActivity::class.java)
            startActivity(intent)
            finish()
        }, 4000)


        val homeIndicator: ImageView? = findViewById(R.id.home_indicator)
        homeIndicator?.setOnClickListener {
            moveTaskToBack(true)
            finish()
        }
    }
}
