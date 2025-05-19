package com.example.ficaforta

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text


class LoginMain : AppCompatActivity() {
    lateinit var recuperar_conta : TextView
    lateinit var btn_login : Button
    lateinit var edit_text_email : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_main)

        recuperar_conta = findViewById<TextView>(R.id.recuperarContaLink)
        btn_login = findViewById<Button>(R.id.loginBtn)
        edit_text_email = findViewById<EditText>(R.id.emailEditText)


        recuperar_conta.setOnClickListener {
            val intent = Intent(this, RecuperarConta::class.java)
            startActivity(intent)
        }

        btn_login.setOnClickListener {
            if (edit_text_email.text.toString() == "adm"){
                val intent = Intent(this, HomeAdm::class.java)
                startActivity(intent)
            }else {
                val intent = Intent(this, HomeUsuario::class.java)
                startActivity(intent)
            }

        }
    }
}