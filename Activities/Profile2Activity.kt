package com.abdulsamee.i221051

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Profile2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile2)

        val doneButton = findViewById<TextView>(R.id.done_button)
        val cancelButton = findViewById<TextView>(R.id.cancel_button)
        val switchToProfessional = findViewById<TextView>(R.id.switch_to_professional)


        doneButton.setOnClickListener {
            navigateBackToProfile()
        }

        cancelButton.setOnClickListener {
            navigateBackToProfile()
        }

        switchToProfessional.setOnClickListener {
            navigateBackToProfile()
        }
    }

    private fun navigateBackToProfile() {
        val intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)

        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)

        finish()
    }
}