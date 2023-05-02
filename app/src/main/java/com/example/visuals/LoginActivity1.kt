package com.example.visuals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton
import android.widget.TextView

class LoginActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login1)

        val btn_login = findViewById<AppCompatButton>(R.id.button) as AppCompatButton
        val sign_up = findViewById<TextView>(R.id.label_btn) as TextView

        btn_login.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MapsActivity::class.java)
            startActivity(intent)
        })

        sign_up.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, SignupActivity2::class.java)
            startActivity(intent)
        })
    }
}