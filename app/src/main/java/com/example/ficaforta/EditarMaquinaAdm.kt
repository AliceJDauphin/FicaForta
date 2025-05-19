package com.example.ficaforta

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EditarMaquinaAdm : AppCompatActivity() {
    lateinit var btn_salvar_maquina : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editar_maquina_adm)

        btn_salvar_maquina = findViewById<Button>(R.id.salvarMaquinaAdmBtn)

        btn_salvar_maquina.setOnClickListener {
            val intent = Intent(this, MaquinaAdm::class.java)
            startActivity(intent)
        }
    }
}