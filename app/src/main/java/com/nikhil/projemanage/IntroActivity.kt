package com.nikhil.projemanage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class IntroActivity : AppCompatActivity() {
    var btnSignUp : Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        btnSignUp = findViewById(R.id.btn_sign_up_intro)
        btnSignUp?.setOnClickListener{
            startActivity(Intent(this,SignUpActivity::class.java))
        }
    }
}