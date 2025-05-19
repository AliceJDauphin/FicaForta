package com.example.ficaforta

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EditarPerfilAdm : AppCompatActivity() {
    lateinit var btn_salvar_perfil : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editar_perfil_adm)

        btn_salvar_perfil = findViewById<Button>(R.id.SalvarPerfilAdmBtn)

        btn_salvar_perfil.setOnClickListener {
            val intent = Intent(this, PerfilAdm::class.java)
            startActivity(intent)
        }
    }
}