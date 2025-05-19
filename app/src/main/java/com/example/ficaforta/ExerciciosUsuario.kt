package com.example.ficaforta

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ExerciciosUsuario : AppCompatActivity() {
    lateinit var btn_finalizar_treino : Button
    lateinit var exercicio_card : ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_exercicios_usuario)

        btn_finalizar_treino = findViewById<Button>(R.id.finalizarTreinoBtn)

        exercicio_card = findViewById<ConstraintLayout>(R.id.exercicioConstraint)

        btn_finalizar_treino.setOnClickListener {
            val intent = Intent(this, HomeUsuario::class.java)
            startActivity(intent)
        }

        exercicio_card.setOnClickListener {
            val intent = Intent(this, ExercicioUsuario::class.java)
            startActivity(intent)
        }
    }
}