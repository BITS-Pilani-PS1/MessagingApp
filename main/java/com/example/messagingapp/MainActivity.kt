package com.example.messagingapp

import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity() {
    lateinit var loginActivity_Username: EditText
    lateinit var loginActivity_Password: EditText
    lateinit var loginActivity_loginBtn: Button
    lateinit var loginActivity_newUser: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CastComponents()

    }

    fun CastComponents() {
        loginActivity_Username = findViewById(R.id.loginActivity_Username);
        loginActivity_Password = findViewById(R.id.loginActivity_Password);
        loginActivity_loginBtn = findViewById(R.id.loginActivity_loginBtn);
        loginActivity_newUser = findViewById(R.id.loginActivity_registerUserText);
    }
    fun goToRegisteration(v: View){
        val intent= Intent(this, RegisterUserActivity::class.java)
        startActivity(intent)
    }

}