package com.sushmita.week6assignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.button.MaterialButton

class LoginActivity : AppCompatActivity() {

    private lateinit var uname: EditText
    private lateinit var password: EditText
    private lateinit var btn: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        uname = findViewById(R.id.uname)
        password = findViewById(R.id.password)
        btn = findViewById(R.id.btn)

        btn.setOnClickListener {
            checkValid()
        }

    }

    fun checkValid(){
        val username = uname.text.toString()
        val password = password.text.toString()
        if (username == "softwarica" && password == "coventry" ){
            val intent = Intent( this,MainActivity::class.java )
            startActivity(intent)
        }
    }
}