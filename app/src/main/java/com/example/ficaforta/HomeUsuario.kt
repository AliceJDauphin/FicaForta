package com.example.ficaforta

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeUsuario : AppCompatActivity() {
    lateinit var perfil_usuario : ImageView
    lateinit var abrir_chat : Button
    lateinit var treino_card_A : ConstraintLayout
    lateinit var treino_card_B : ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_usuario)

        perfil_usuario = findViewById<ImageView>(R.id.imgPerfil)
        treino_card_A = findViewById<ConstraintLayout>(R.id.treinoA)
        treino_card_B = findViewById<ConstraintLayout>(R.id.treinoB)
        abrir_chat = findViewById<Button>(R.id.abrirChat)

        perfil_usuario.setOnClickListener {
            val intent = Intent(this, PerfilUsuario::class.java)
            startActivity(intent)
        }

        treino_card_A.setOnClickListener {
            val intent = Intent(this, ExerciciosUsuario::class.java)
            startActivity(intent)
        }

        treino_card_B.setOnClickListener {
            val intent = Intent(this, ExerciciosUsuario::class.java)
            startActivity(intent)
        }

        abrir_chat.setOnClickListener {
            val intent = Intent(this, ChatGemini::class.java)
            startActivity(intent)
        }
    }
}