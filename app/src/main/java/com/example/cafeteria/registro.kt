package com.example.cafeteria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        val ini: Button = findViewById(R.id.registerbtn)
        ini.setOnClickListener {

            val intent: Intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}