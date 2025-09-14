package com.abdulsamee.i221051

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)


        setupNavigation()


        val homeIndicator: ImageView = findViewById(R.id.homeIndicator)
        homeIndicator.setOnClickListener {
            moveTaskToBack(true)
            finish()
        }
    }

    private fun setupNavigation() {
        findViewById<View>(R.id.search_icon).setOnClickListener {
            startActivity(Intent(this, SearchActivity::class.java))
        }


        findViewById<View>(R.id.create_icon).setOnClickListener {
            startActivity(Intent(this, CameraActivity::class.java))
        }


        findViewById<View>(R.id.profile_icon).setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }


        findViewById<View>(R.id.your_story).setOnClickListener {
            val intent = Intent(this, StoryActivity::class.java)
            intent.putExtra("STORY_ID", "your_story")
            startActivity(intent)
        }


        findViewById<View>(R.id.zack_story).setOnClickListener {
            openWatchStory()
        }
        findViewById<View>(R.id.denzel_story).setOnClickListener {
            openWatchStory()
        }
        findViewById<View>(R.id.keiron_story).setOnClickListener {
            openWatchStory()
        }
        findViewById<View>(R.id.karen_story).setOnClickListener {
            openWatchStory()
        }
    }

    private fun openWatchStory() {
        val intent = Intent(this, WatchStoryActivity::class.java)
        startActivity(intent)
    }

}
