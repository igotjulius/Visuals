package com.example.visuals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class SignupActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup2)

        val login = findViewById<TextView>(R.id.label_btn) as TextView
        val sign_up_btn = findViewById<Button>(R.id.button) as Button

        sign_up_btn.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, LoginActivity1::class.java)
            startActivity(intent)
        })

        login.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, LoginActivity1::class.java)
            startActivity(intent)
        })
    }
}