package com.abdulsamee.i221051

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class WatchStoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.watch_story)

        val closeBtn: ImageView = findViewById(R.id.closeBtn)
        closeBtn.setOnClickListener {
            finish()
        }


        val shareBtn: ImageView = findViewById(R.id.shareBtn)
        shareBtn.setOnClickListener {
            val intent = Intent(this, MessagesActivity::class.java)
            startActivity(intent)
        }


    }
}
