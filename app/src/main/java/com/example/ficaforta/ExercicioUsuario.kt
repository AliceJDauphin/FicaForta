package com.example.ficaforta

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ExercicioUsuario : AppCompatActivity() {
    lateinit var maquina_card : ConstraintLayout
    lateinit var  btn_finalizar_exercicio : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_exercicio_usuario)

        maquina_card = findViewById<ConstraintLayout>(R.id.maquinaConstraint)

        btn_finalizar_exercicio = findViewById<Button>(R.id.finalizarExercicioBtn)

        maquina_card.setOnClickListener {
            val intent = Intent(this, MaquinaUsuario::class.java)
            startActivity(intent)
        }

        btn_finalizar_exercicio.setOnClickListener {
            val intent = Intent(this, ExerciciosUsuario::class.java)
            startActivity(intent)
        }

    }
}