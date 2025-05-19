package com.example.ficaforta

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MaquinaUsuario : AppCompatActivity() {
    lateinit var btn_voltar : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maquina_usuario)

        btn_voltar = findViewById<Button>(R.id.voltarMaquinaBtn)

        btn_voltar.setOnClickListener {
            val intent = Intent(this, ExercicioUsuario::class.java)
            startActivity(intent )
        }
    }
}