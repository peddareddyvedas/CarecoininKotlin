package com.example.rise.carecoininkotlin.LoginModule

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.InputType
import android.widget.*
import com.example.rise.carecoininkotlin.R

/**
 * Created by Rise on 23/04/2018.
 */
class NewPassword : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newpassword)
        init()
    }

    private fun init() {
        val editText_Password: EditText = findViewById(R.id.editText_Password);
        val Done: Button = findViewById(R.id.newpassword)
        var checkBox: CheckBox = findViewById(R.id.chk1)
        val btn_back: Button = findViewById(R.id.back)


        val loginlayout: RelativeLayout = findViewById(R.id.loginlayout)
        val background = loginlayout.background
        background.alpha = 30

        Done.setOnClickListener {
            val intent = Intent(this, ChangePassword::class.java)
            startActivity(intent)
        }
        btn_back.setOnClickListener {
            finish()
        }
        //Event Handling for CheckBox
        checkBox.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                //To show password
                editText_Password.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD)
            } else {
                //To hide Password
                editText_Password.setInputType(InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD)
            }
        })
    }
}
