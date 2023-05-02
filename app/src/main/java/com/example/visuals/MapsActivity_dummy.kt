package com.example.visuals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MapsActivity_dummy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps_dummy)

        val icon_btn = findViewById<ImageView>(R.id.icon_btn) as ImageView

        icon_btn.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this@MapsActivity_dummy, Settings::class.java))
        })

    }
}