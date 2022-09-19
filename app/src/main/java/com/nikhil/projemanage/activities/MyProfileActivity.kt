package com.nikhil.projemanage.activities

import android.os.Bundle
import com.bumptech.glide.Glide
import com.nikhil.projemanage.R
import kotlinx.android.synthetic.main.activity_my_profile.*

// TODO (Step 1: Create a MyProfileActivity class.)
// START
class MyProfileActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_profile)

        // TODO (Step 8: Call a function to setup action bar.)
        setupActionBar()
    }

    // TODO (Step 7: Create a function to setup action bar.)
    // START
    /**
     * A function to setup action bar
     */
    private fun setupActionBar() {

        setSupportActionBar(toolbar_my_profile_activity)

        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeAsUpIndicator(R.drawable.icbaselinearrowbackios24)
            actionBar.title = resources.getString(R.string.my_profile)
        }

        toolbar_my_profile_activity.setNavigationOnClickListener { onBackPressed() }
    }
//    // END
}
// END