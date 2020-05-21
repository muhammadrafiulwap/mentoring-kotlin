package com.udacoding.mentoringkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_dialog.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonLogin.setOnClickListener {

            val dataLogin = ModelLogin(textUsername.text.toString(), textPassword.text.toString())

            val intent = Intent(this, ImplicitIntent::class.java)
            intent.putExtra("data", dataLogin)
            startActivity(intent)
            finish()
        }

    }
}
