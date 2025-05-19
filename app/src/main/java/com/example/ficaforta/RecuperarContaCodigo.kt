package com.example.ficaforta

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RecuperarContaCodigo : AppCompatActivity() {
    lateinit var btn_validar_codigo : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperar_conta_codigo)

        btn_validar_codigo = findViewById<Button>(R.id.validarCodigoBtn)

        btn_validar_codigo.setOnClickListener {
            val intent = Intent(this, RecuperarContaRedefinirSenha::class.java)
            startActivity(intent)
        }
    }
}