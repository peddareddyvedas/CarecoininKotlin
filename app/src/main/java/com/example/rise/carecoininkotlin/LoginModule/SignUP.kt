package com.example.rise.carecoininkotlin.LoginModule

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.InputType
import android.widget.*
import com.example.rise.carecoininkotlin.HomeActivity
import com.example.rise.carecoininkotlin.R


/**
 * Created by Rise on 23/04/2018.
 */
class SignUP : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        init();

    }

    private fun init() {

        val et_user_name: EditText = findViewById(R.id.editText_Email)
        val et_password: EditText = findViewById(R.id.editText_password)
        val et_conformpassword: EditText = findViewById(R.id.confirmPasswordTextField)
        val btn_back: Button = findViewById(R.id.back)
        val btn_signin: Button = findViewById(R.id.signin)
        var checkBox: CheckBox = findViewById(R.id.chk)
        var checkBox1: CheckBox = findViewById(R.id.chk1)

        val loginlayout: RelativeLayout = findViewById(R.id.loginlayout)
        val background = loginlayout.background
        background.alpha = 30

        btn_back.setOnClickListener {
            finish()

        }
        btn_signin.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)

            startActivity(intent)

        }
        //Event Handling for CheckBox
        checkBox.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                //To show password
                et_password.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD)
            } else {
                //To hide Password
                et_password.setInputType(InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD)
            }
        })
        //Event Handling for CheckBox
        checkBox1.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                //To show password
                et_conformpassword.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD)
            } else {
                //To hide Password
                et_conformpassword.setInputType(InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD)
            }
        })

    }

}