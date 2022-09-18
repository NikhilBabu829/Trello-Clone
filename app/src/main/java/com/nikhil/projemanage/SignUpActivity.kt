package com.nikhil.projemanage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar

class SignUpActivity : AppCompatActivity() {
    var setUpActionBar : Toolbar? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        setUpActionBar = findViewById(R.id.toolbar_sign_up_activity)
        setupActionBar()
    }
    private fun setupActionBar(){
        setSupportActionBar(setUpActionBar)
        val actionBar = supportActionBar
        if(actionBar!=null){
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeAsUpIndicator(R.drawable.icbaselinearrowbackios24)
        }
    }

}