package com.nikhil.projemanage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import androidx.appcompat.widget.Toolbar

class SignInActivity : AppCompatActivity() {
    var signInToolBar : Toolbar? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        signInToolBar = findViewById(R.id.toolbar_sign_in_activity)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setupActionBarSignIn()
    }
    private fun setupActionBarSignIn(){
        setSupportActionBar(signInToolBar)
        val actionBarSignIn = supportActionBar
        if(actionBarSignIn!=null){
            actionBarSignIn.setDisplayHomeAsUpEnabled(true)
            actionBarSignIn.setHomeAsUpIndicator(R.drawable.icbaselinearrowbackios24)
        }
        signInToolBar?.setNavigationOnClickListener{onBackPressed()}
    }
}