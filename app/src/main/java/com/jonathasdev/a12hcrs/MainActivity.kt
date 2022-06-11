package com.jonathasdev.a12hcrs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val greetingTextView = findViewById<TextView>(R.id.hello_msg)
        val inputField = findViewById<EditText>(R.id.namee)
        val submitButton = findViewById<Button>(R.id.btn_nome)
        val offersButton = findViewById<Button>(R.id.btn_prop)
        var resultName = ""

        submitButton.setOnClickListener {
            resultName = inputField.text.toString()

            if (resultName == "") {
                offersButton.visibility = View.INVISIBLE
                greetingTextView.text = ""
                Toast.makeText(
                    this, "Enter your name!",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val message = "Welcome $resultName !"
                greetingTextView.text = message
                inputField.text.clear()
                offersButton.visibility = View.VISIBLE
            }
        }

        offersButton.setOnClickListener {
            val intent = Intent(this, SecondScreen::class.java)
            intent.putExtra("USER",resultName)
            startActivity(intent)

        }

    }
}