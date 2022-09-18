package com.nikhil.projemanage.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.nikhil.projemanage.R
import kotlinx.android.synthetic.main.activity_sign_in.*
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : BaseActivity() {
    var setUpActionBar : Toolbar? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        setUpActionBar = findViewById(R.id.toolbar_sign_up_activity)
        setupActionBar()
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
    }
    private fun setupActionBar(){
        setSupportActionBar(setUpActionBar)
        val actionBar = supportActionBar
        if(actionBar!=null){
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeAsUpIndicator(R.drawable.icbaselinearrowbackios24)
        }
        setUpActionBar?.setNavigationOnClickListener{onBackPressed()}
        btn_sign_up.setOnClickListener{
            registerUser()
        }
    }
    private fun registerUser(){
        val name:String = et_name.text.toString().trim{
            it <= ' '
        }
        val email:String = et_email.text.toString().trim{
            it <= ' '
        }
        val password:String = et_password.text.toString().trim{it<=' '}
        if(validateForm(name,email,password)){
            Toast.makeText(this,"Now we can register a new user",Toast.LENGTH_SHORT).show()
        }
    }

    private fun validateForm(name:String,email:String,password:String):Boolean{
        return when{
            TextUtils.isEmpty(name)->{
                showErrorSnackBar("Please enter a name")
                false
            }
            TextUtils.isEmpty(email)->{
                showErrorSnackBar("Please enter an email")
                false
            }
            TextUtils.isEmpty(password)->{
                showErrorSnackBar("Please enter a password")
                false
            }else->{
                return true
            }
        }
    }

}