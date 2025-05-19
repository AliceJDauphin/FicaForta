package com.example.ficaforta

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PerfilAdm : AppCompatActivity() {
    lateinit var btn_editar_perfil : Button
    lateinit var btn_voltar_adm : Button
    lateinit var btn_logout_adm : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil_adm)

        btn_voltar_adm = findViewById<Button>(R.id.voltarHomeAdmBtn)
        btn_editar_perfil = findViewById<Button>(R.id.editarPerfilAdmBtn)
        btn_logout_adm = findViewById<Button>(R.id.logoutAdmBtn)

        btn_voltar_adm.setOnClickListener {
            val intent = Intent(this, HomeAdm::class.java)
            startActivity(intent)
        }

        btn_editar_perfil.setOnClickListener {
            val intent = Intent(this, EditarPerfilAdm::class.java)
            startActivity(intent)
        }

        btn_logout_adm.setOnClickListener {
            val intent = Intent(this, LoginMain::class.java)
            startActivity(intent)
        }
    }
}