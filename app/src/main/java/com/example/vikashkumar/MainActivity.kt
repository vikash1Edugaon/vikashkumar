package com.example.vikashkumar

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

//val getpassword = intent.extras?.getString("password")
//val password = findViewById<TextView>(R.id.password)
//password.text = getpassword

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val login = findViewById<Button>(R.id.button)
        val name = findViewById<TextView>(R.id.name)
        login.setOnClickListener {

            intent = Intent(this, ::class.java)
            intent.putExtra("name", "${name.text}")
            startActivity(intent)
        }
    }
}