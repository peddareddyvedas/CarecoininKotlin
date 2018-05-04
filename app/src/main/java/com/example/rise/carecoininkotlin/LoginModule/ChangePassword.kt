package com.example.rise.carecoininkotlin.LoginModule

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.InputType
import android.widget.*
import com.example.rise.carecoininkotlin.HomeModule.AddDeviceViewController
import com.example.rise.carecoininkotlin.R

/**
 * Created by Rise on 24/04/2018.
 */
class ChangePassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_changepassword)
        init()
    }

    private fun init() {

        val editoldpassword: EditText = findViewById(R.id.editoldpassword)
        val editnewpassword: EditText = findViewById(R.id.editnewpassword)
        val btn_back: Button = findViewById(R.id.back)
        val btn_done: Button = findViewById(R.id.done)
        var checkBox: CheckBox = findViewById(R.id.chk)
        var checkBox1: CheckBox = findViewById(R.id.chk1)

        val loginlayout: RelativeLayout = findViewById(R.id.loginlayout)
        val background = loginlayout.background
        background.alpha = 30

        btn_back.setOnClickListener {
            finish()

        }
        btn_done.setOnClickListener {
            val intent = Intent(this, AddDeviceViewController::class.java)
            startActivity(intent)

        }
        //Event Handling for CheckBox
        checkBox.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                //To show password
                editoldpassword.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD)
            } else {
                //To hide Password
                editoldpassword.setInputType(InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD)
            }
        })
        //Event Handling for CheckBox
        checkBox1.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                //To show password
                editnewpassword.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD)
            } else {
                //To hide Password
                editnewpassword.setInputType(InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD)
            }
        })

    }

}
