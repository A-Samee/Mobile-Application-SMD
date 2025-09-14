package com.abdulsamee.i221051

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class FollowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.feed_follow)


        val followingTab = findViewById<TextView>(R.id.tab_following)
        val youTab = findViewById<TextView>(R.id.tab_you)


        youTab.setOnClickListener {
            // Navigate to YouActivity when "You" tab is pressed
            val intent = Intent(this, YouActivity::class.java)
            startActivity(intent)


            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }


        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        val homeIcon = findViewById<ImageView>(R.id.home_icon)
        val searchIcon = findViewById<ImageView>(R.id.search_icon)
        val createIcon = findViewById<ImageView>(R.id.create_icon)
        val reelsIcon = findViewById<ImageView>(R.id.reels_icon)
        val profileIcon = findViewById<ImageView>(R.id.profile_icon)
        val homeIndicator = findViewById<ImageView>(R.id.home_indicator)


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
        homeIndicator.setOnClickListener {

            finishAffinity() // Close all activities
        }

        profileIcon.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}