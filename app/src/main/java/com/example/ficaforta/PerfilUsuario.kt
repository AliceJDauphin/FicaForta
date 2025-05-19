package com.example.ficaforta

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PerfilUsuario : AppCompatActivity() {
    lateinit var btn_editar_perfil : Button
    lateinit var btn_voltar_home : Button
    lateinit var btn_logout_user : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_perfil_usuario)

        btn_editar_perfil = findViewById<Button>(R.id.editarPerfilBtn)
        btn_voltar_home = findViewById<Button>(R.id.voltarHomeBtn)
        btn_logout_user = findViewById<Button>(R.id.logoutUserBtn)

        btn_editar_perfil.setOnClickListener {
            val intent = Intent(this, EditarPerfilUsuario::class.java)
            startActivity(intent)
        }

        btn_voltar_home.setOnClickListener {
            val intent = Intent(this, HomeUsuario::class.java)
            startActivity(intent)
        }

        btn_logout_user.setOnClickListener {
            val intent = Intent(this, LoginMain::class.java)
            startActivity(intent)
        }

    }
}