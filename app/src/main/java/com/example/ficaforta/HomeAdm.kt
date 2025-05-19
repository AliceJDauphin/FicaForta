package com.example.ficaforta

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeAdm : AppCompatActivity() {
    lateinit var perfil_usuario : ImageView
    lateinit var btn_exercicios : Button
    lateinit var btn_maquinas : Button
    lateinit var btn_usuarios : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_adm)

        perfil_usuario = findViewById<ImageView>(R.id.imgPerfilAdm)
        btn_exercicios = findViewById<Button>(R.id.exerciciosBtn)
        btn_maquinas = findViewById<Button>(R.id.maquinasBtn)
        btn_usuarios = findViewById<Button>(R.id.usuariosBtn)

        perfil_usuario.setOnClickListener {
            val intent = Intent(this, PerfilAdm::class.java)
            startActivity(intent)
        }

        btn_exercicios.setOnClickListener {
            val intent = Intent(this, ExerciciosAdm::class.java)
            startActivity(intent)
        }

        btn_maquinas.setOnClickListener {
            val intent = Intent(this, MaquinasAdm::class.java)
            startActivity(intent)
        }

        btn_usuarios.setOnClickListener {
            val intent = Intent(this, UsuariosAdm::class.java)
            startActivity(intent)
        }
    }
}