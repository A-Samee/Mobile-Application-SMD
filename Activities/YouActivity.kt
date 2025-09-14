package com.abdulsamee.i221051

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class YouActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.you)


        val followingTab = findViewById<TextView>(R.id.tab_following)
        val youTab = findViewById<TextView>(R.id.tab_you)

        followingTab.setOnClickListener {
            val intent = Intent(this, FollowActivity::class.java)
            startActivity(intent)

            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)

            finish()
        }


        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        val homeIcon = findViewById<ImageView>(R.id.home_icon)
        val searchIcon = findViewById<ImageView>(R.id.search_icon)
        val createIcon = findViewById<ImageView>(R.id.create_icon)
        val reelsIcon = findViewById<ImageView>(R.id.reels_icon)
        val profileIcon = findViewById<ImageView>(R.id.profile_icon)

        homeIcon.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
            finish()
        }

        searchIcon.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }

        createIcon.setOnClickListener {
            val intent = Intent(this, CameraActivity::class.java)
            startActivity(intent)
        }



        profileIcon.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}