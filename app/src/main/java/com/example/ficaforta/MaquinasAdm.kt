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

class MaquinasAdm : AppCompatActivity() {
    lateinit var btn_voltar_maquinas : Button
    lateinit var btn_adicionar_maquina : Button
    lateinit var maquina_card : ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maquinas_adm)

        btn_voltar_maquinas = findViewById<Button>(R.id.voltarMaquinasAdmBtn)
        btn_adicionar_maquina = findViewById<Button>(R.id.adicionarMaquinaAdmBtn)
        maquina_card = findViewById<ConstraintLayout>(R.id.maquinaConstraintAdm)

        btn_voltar_maquinas.setOnClickListener {
            val intent = Intent(this, HomeAdm::class.java)
            startActivity(intent)
        }

        btn_adicionar_maquina.setOnClickListener {
            val toast = Toast.makeText(this, "Popup para adicionar nova Máquina", Toast.LENGTH_LONG).show()
        }

        maquina_card.setOnClickListener {
            val intent = Intent(this, MaquinaAdm::class.java)
            startActivity(intent)
        }
    }
}