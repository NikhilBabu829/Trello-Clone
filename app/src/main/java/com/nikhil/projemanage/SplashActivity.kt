package com.nikhil.projemanage

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.HandlerThread
import android.view.WindowManager
import android.widget.TextView

class SplashActivity : AppCompatActivity() {
    var tvAppName : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        tvAppName = findViewById(R.id.tvAppName)
//        val typeFace : Typeface = Typeface.createFromAsset(assets,"Nabla-Regular-VariableFont_EDPT,EHLT.ttf"
        val typeFace : Typeface = Typeface.createFromAsset(assets,"RampartOne-Regular.ttf")
        tvAppName?.typeface = typeFace
        Handler().postDelayed({
            startActivity(Intent(this,IntroActivity::class.java))
            finish()
        },2500)
    }
}