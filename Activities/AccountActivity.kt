package com.abdulsamee.i221051

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class AccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.account)


        val loginButton = findViewById<Button>(R.id.btn_login)
        val signUpText = findViewById<TextView>(R.id.tv_sign_up)
        val homeIndicator = findViewById<ImageView>(R.id.home_indicator)


        loginButton.setOnClickListener {

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }


        signUpText.setOnClickListener {

            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)


            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }



        homeIndicator.setOnClickListener {
            finishAffinity()
        }
    }
}