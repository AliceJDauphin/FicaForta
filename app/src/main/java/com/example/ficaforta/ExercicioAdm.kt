package com.example.ficaforta

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ExercicioAdm : AppCompatActivity() {
    lateinit var btn_editar_exercicio : Button
    lateinit var btn_voltar_exercicio : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercicio_adm)

        btn_voltar_exercicio = findViewById<Button>(R.id.voltarExercicioAdmBtn)
        btn_editar_exercicio = findViewById<Button>(R.id.editarExercicioAdmBtn)

        btn_voltar_exercicio.setOnClickListener {
            val intent = Intent(this, ExerciciosAdm::class.java)
            startActivity(intent)
        }

        btn_editar_exercicio.setOnClickListener {
            val intent = Intent(this, EditarExercicioAdm::class.java)
            startActivity(intent)
        }
    }
}