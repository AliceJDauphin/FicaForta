package com.example.ficaforta

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RecuperarContaRedefinirSenha : AppCompatActivity() {
    lateinit var btn_voltar_login : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperar_conta_redefinir_senha)

        btn_voltar_login = findViewById<Button>(R.id.voltarLoginBtn)

        btn_voltar_login.setOnClickListener {
            val intent = Intent(this, LoginMain::class.java)
            startActivity(intent)
        }
    }
}