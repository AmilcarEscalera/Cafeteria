package com.example.cafeteria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val ini1: Button = findViewById(R.id.loginbtn)
        ini1.setOnClickListener {

            val intent: Intent = Intent (this, productos::class.java)
            startActivity(intent)
        }
    }
}