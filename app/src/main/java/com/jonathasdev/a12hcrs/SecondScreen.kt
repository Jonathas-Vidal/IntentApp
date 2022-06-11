package com.jonathasdev.a12hcrs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)

        val user = intent.getStringExtra("USER")
        val txtView  = findViewById<TextView>(R.id.exibOf)
        val message = "$user see these offers!"
        txtView.text = message
    }
}