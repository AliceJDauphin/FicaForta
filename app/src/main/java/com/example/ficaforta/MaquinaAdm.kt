package com.example.ficaforta

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MaquinaAdm : AppCompatActivity() {
    lateinit var btn_voltar_maquina : Button
    lateinit var btn_editar_maquina : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maquina_adm)

        btn_editar_maquina = findViewById<Button>(R.id.editarMaquinaAdm)
        btn_voltar_maquina = findViewById<Button>(R.id.voltarMaquinaAdmBtn)

        btn_editar_maquina.setOnClickListener {
            val intent = Intent(this, EditarMaquinaAdm::class.java)
            startActivity(intent)
        }

        btn_voltar_maquina.setOnClickListener {
            val intent = Intent(this, MaquinasAdm::class.java)
            startActivity(intent)
        }
    }
}