package com.example.opsc7311_budgetapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CategoryPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.category)

        val welcomeText: TextView = findViewById(R.id.tvWelcome)
        val username = intent.getStringExtra("USERNAME")
        welcomeText.text = "Welcome, $username!"
    }
}
