package com.example.cafeteria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class productos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)
        val ini5 : ImageButton = findViewById(R.id.cafe)
        ini5.setOnClickListener {

            val intent : Intent = Intent (this, lista::class.java)
            startActivity(intent)
        }
    }

}