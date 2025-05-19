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

class EditarExercicioAdm : AppCompatActivity() {
    lateinit var btn_salva_exercicio : Button
    lateinit var mudar_maquina_card : ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editar_exercicio_adm)

        mudar_maquina_card = findViewById<ConstraintLayout>(R.id.mudarMaquinaConstraintAdm)
        btn_salva_exercicio = findViewById<Button>(R.id.salvarExercicioAdmBtn)

        mudar_maquina_card.setOnClickListener {
            val toast = Toast.makeText(this, "Abrir popup para mudar maquina no exercício", Toast.LENGTH_LONG).show()
        }

        btn_salva_exercicio.setOnClickListener {
            val intent = Intent(this, ExercicioAdm::class.java)
            startActivity(intent)
        }
    }
}