package com.abdulsamee.i221051

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MessagesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.messages)


        val zackRow = findViewById<LinearLayout>(R.id.row_zack)
        zackRow.setOnClickListener {
            val intent = Intent(this, DmActivity::class.java)
            startActivity(intent)
        }

        val homeIndicator = findViewById<ImageView>(R.id.home_indicator)
        homeIndicator.setOnClickListener {
            moveTaskToBack(true)
            finish()
        }
    }
}
