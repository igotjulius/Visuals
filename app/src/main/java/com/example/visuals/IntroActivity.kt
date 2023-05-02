package com.example.visuals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        val get_started = findViewById<TextView>(R.id.button) as TextView

        get_started.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, LoginActivity1::class.java)
            startActivity(intent)
        })
    }
}