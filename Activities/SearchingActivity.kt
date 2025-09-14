package com.abdulsamee.i221051

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class SearchingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.searching)

        val searchEditText = findViewById<EditText>(R.id.searchEditText)
        val clearButton = findViewById<Button>(R.id.clearButton)
        val backButton = findViewById<ImageView>(R.id.search)



        clearButton.setOnClickListener {
            searchEditText.setText("")
        }


        backButton.setOnClickListener {
            finish()
        }

        searchEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                if (s.toString().isBlank()) {
                    finish()
                }
            }
        })


    }


}