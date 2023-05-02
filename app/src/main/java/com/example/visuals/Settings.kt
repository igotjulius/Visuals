package com.example.visuals

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.RelativeLayout

class Settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val sign_out = findViewById<RelativeLayout>(R.id.sign_out) as RelativeLayout
        val back_btn = findViewById<ImageView>(R.id.back_btn) as ImageView

        sign_out.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this@Settings, LoginActivity1::class.java))
        })

        back_btn.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this@Settings, MapsActivity_dummy::class.java))
        })
    }
}