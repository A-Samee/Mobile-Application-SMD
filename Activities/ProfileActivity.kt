package com.abdulsamee.i221051

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.cardview.widget.CardView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)

        val editProfileButton = findViewById<CardView>(R.id.edit_profile_button)
        val downArrow = findViewById<ImageView>(R.id.downArrow)
        val downArrowLayout = findViewById<View>(R.id.downArrowLayout)


        editProfileButton.setOnClickListener {
            // Navigate to Profile2Activity when edit profile is pressed
            val intent = Intent(this, Profile2Activity::class.java)
            startActivity(intent)


            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        downArrow.setOnClickListener {
            navigateToHome()
        }

        downArrowLayout.setOnClickListener {
            navigateToHome()
        }
    }

    private fun navigateToHome() {
        val intent = Intent(this, HomeActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)

        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)

        finish()
    }
}