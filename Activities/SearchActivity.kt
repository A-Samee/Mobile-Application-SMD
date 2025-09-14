package com.abdulsamee.i221051

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search)


        val searchEditText = findViewById<EditText>(R.id.searchEditText)
        val homeIcon = findViewById<ImageView>(R.id.home_icon)
        val searchIcon = findViewById<ImageView>(R.id.search_icon)
        val createIcon = findViewById<ImageView>(R.id.create_icon)
        val reelsIcon = findViewById<ImageView>(R.id.reels_icon)
        val profileIcon = findViewById<ImageView>(R.id.profile_icon)



        val homeIndicator: ImageView = findViewById(R.id.homeIndicator)

        homeIndicator.setOnClickListener {
            moveTaskToBack(true)
            finish()
        }

        searchEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                if (s.toString().equals("intershala", ignoreCase = true)) {
                    // Navigate to searching.xml when "intershala" is typed
                    val intent = Intent(this@SearchActivity, SearchingActivity::class.java)
                    startActivity(intent)
                }
            }
        })

        setupBottomNavigation(homeIcon, searchIcon, createIcon, reelsIcon, profileIcon)
    }

    private fun setupBottomNavigation(
        homeIcon: ImageView,
        searchIcon: ImageView,
        createIcon: ImageView,
        reelsIcon: ImageView,
        profileIcon: ImageView
    ) {
        homeIcon.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
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