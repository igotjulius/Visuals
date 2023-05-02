package com.example.visuals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.constraintlayout.motion.widget.MotionLayout

class SplashActivity : AppCompatActivity() {

    private lateinit var motionLayout: MotionLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash1)


        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        motionLayout = findViewById(R.id.splash)
        motionLayout.startLayoutAnimation()

        motionLayout.setTransitionListener(object :MotionLayout.TransitionListener{
            override fun onTransitionStarted(
                motionLayout: MotionLayout?,
                startId: Int,
                endId: Int
            ) {

            }

            override fun onTransitionChange(
                motionLayout: MotionLayout?,
                startId: Int,
                endId: Int,
                progress: Float
            ) {

            }

            override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {
                startActivity(Intent(this@SplashActivity, IntroActivity::class.java))
                finish()
            }

            override fun onTransitionTrigger(
                motionLayout: MotionLayout?,
                triggerId: Int,
                positive: Boolean,
                progress: Float
            ) {

            }

        })
    }
}