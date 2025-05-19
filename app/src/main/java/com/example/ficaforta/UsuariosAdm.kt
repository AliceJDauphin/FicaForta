package com.example.ficaforta

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class UsuariosAdm : AppCompatActivity() {
    lateinit var btn_volta : Button
    lateinit var btn_adicionar_usuario : Button
    lateinit var usuario_card : ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuarios_adm)

        btn_volta = findViewById<Button>(R.id.voltarUsuariosAdmBtn)
        btn_adicionar_usuario = findViewById<Button>(R.id.adicionarUsuarioAdmBtn)
        usuario_card = findViewById<ConstraintLayout>(R.id.usuarioConstraintAdm)

        btn_volta.setOnClickListener {
            val intent = Intent(this, HomeAdm::class.java)
            startActivity(intent)
        }

        btn_adicionar_usuario.setOnClickListener {
            val toast = Toast.makeText(this, "Popup para cadastrar Usuário", Toast.LENGTH_LONG).show()
        }

        usuario_card.setOnClickListener {
            val intent = Intent(this, UsuarioAdm::class.java)
            startActivity(intent)
        }
    }
}