package com.example.ficaforta

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class ExerciciosAdm : AppCompatActivity() {
    lateinit var btn_voltar : Button
    lateinit var  btn_adicionar : Button
    lateinit var  exercicio_card : ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercicios_adm)

        btn_voltar = findViewById<Button>(R.id.voltarExerciciosBtn)
        btn_adicionar = findViewById<Button>(R.id.adicionarExerciciosBtn)
        exercicio_card = findViewById<ConstraintLayout>(R.id.exercicioConstraintAdm)

        btn_voltar.setOnClickListener {
            val intent = Intent(this, HomeAdm::class.java)
            startActivity(intent)
        }

        btn_adicionar.setOnClickListener {
            val toast = Toast.makeText(this, "Abrir popup para adicionar Exercício", Toast.LENGTH_LONG).show()
        }

        exercicio_card.setOnClickListener {
            val intent = Intent(this, ExercicioAdm::class.java)
            startActivity(intent)
        }
    }
}