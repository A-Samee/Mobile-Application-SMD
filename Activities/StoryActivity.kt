package com.abdulsamee.i221051

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class StoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.story)

        val closeBtn: ImageView = findViewById(R.id.btn_close)
        closeBtn.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        val createBtn: ImageView = findViewById(R.id.btn_create)
        createBtn.setOnClickListener {
            val intent = Intent(this, CameraActivity::class.java)
            startActivity(intent)
        }

        val sendBtn: ImageView = findViewById(R.id.btn_send)
        sendBtn.setOnClickListener {
            val intent = Intent(this, DmActivity::class.java)
            startActivity(intent)
        }
    }
}
