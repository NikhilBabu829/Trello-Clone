package com.nikhil.projemanage.firebase
import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
import com.nikhil.projemanage.activities.MainActivity
import com.nikhil.projemanage.activities.SignInActivity
import com.nikhil.projemanage.activities.SignUpActivity
import com.nikhil.projemanage.models.User
import com.nikhil.projemanage.utils.Constants

class FireStoreClass {
    private val mFireStore = FirebaseFirestore.getInstance()
    fun registerUser(activity: SignUpActivity,userInfo : User){
        mFireStore.collection(Constants.USERS)
            .document(getCurrentUserId()).set(userInfo, SetOptions.merge())
            .addOnSuccessListener {
                activity.userRegisteredSuccess()
            }.addOnFailureListener{
                e->
                Log.e(activity.javaClass.simpleName,"Error Writing Document",e)
            }
    }
    fun signInUser(activity: SignInActivity){
        mFireStore.collection(Constants.USERS)
            .document(getCurrentUserId()).get()
            .addOnSuccessListener { document->
                val loggedInUser = document.toObject(User::class.java)!!
                activity.signInSuccess(loggedInUser)
            }.addOnFailureListener{
                    e->
                Log.e("ClassSignInUser","Error Writing Document",e)
            }
    }
    //this is to login in the user directly to the main activity
    fun getCurrentUserId():String{
        var currentUser = FirebaseAuth.getInstance().currentUser
        var currentUserId = ""
        if(currentUser!= null){
            currentUserId = currentUser.uid
        }
        return currentUserId
    }
}