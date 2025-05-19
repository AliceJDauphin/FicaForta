package com.example.ficaforta

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class UsuarioAdm : AppCompatActivity() {
    lateinit var btn_voltar : Button
    lateinit var btn_editar_usuario : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuario_adm)

        btn_voltar = findViewById<Button>(R.id.voltarUsuarioAdmBtn)
        btn_editar_usuario = findViewById<Button>(R.id.editarUsuarioAdmBtn)

        btn_voltar.setOnClickListener {
            val intent = Intent(this, UsuariosAdm::class.java)
            startActivity(intent)
        }

        btn_editar_usuario.setOnClickListener {
            val intent = Intent(this, EditarUsuarioAdm::class.java)
            startActivity(intent)
        }
    }
}