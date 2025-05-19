package com.example.ficaforta

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class RecuperarConta : AppCompatActivity() {
    lateinit var btn_enviar_email : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperar_conta)

        btn_enviar_email = findViewById<Button>(R.id.enviarEmailBtn)

        btn_enviar_email.setOnClickListener {
            val intent = Intent(this, RecuperarContaCodigo::class.java)
            startActivity(intent)
        }

    }
}