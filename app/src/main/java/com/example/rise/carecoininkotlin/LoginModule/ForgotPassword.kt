package com.example.rise.carecoininkotlin.LoginModule

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.RelativeLayout
import com.example.rise.carecoininkotlin.R

/**
 * Created by Rise on 23/04/2018.
 */
class ForgotPassword : AppCompatActivity() {
    lateinit var et_user_name: EditText
    lateinit var forgotpassword: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgotpassword)
        init()


        val intent = intent
        val bd = intent.extras
        if (bd != null) {
            val emailString = bd.get("email") as String

            et_user_name.setText(emailString)

        }

    }

    private fun init() {

        et_user_name = findViewById(R.id.editText_Email)

        forgotpassword = findViewById(R.id.forgotpassword)

        val btn_back: Button = findViewById(R.id.back)

        btn_back.setOnClickListener {
            finish()

        }
        val loginlayout: RelativeLayout = findViewById(R.id.loginlayout)
        val background = loginlayout.background
        background.alpha = 30


        forgotpassword.setOnClickListener {
            val intent = Intent(this, NewPassword::class.java)

            startActivity(intent)
        }


    }

}