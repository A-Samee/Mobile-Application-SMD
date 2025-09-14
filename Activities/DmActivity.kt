package com.abdulsamee.i221051

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView

class DmActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dm)


        val btnVideoCall = findViewById<ImageView>(R.id.btn_video_call)


        btnVideoCall.setOnClickListener {
            val intent = Intent(this, CallingActivity::class.java)
            startActivity(intent)
        }
    }
}
