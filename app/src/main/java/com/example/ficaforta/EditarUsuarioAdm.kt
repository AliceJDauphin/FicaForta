package com.example.ficaforta

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EditarUsuarioAdm : AppCompatActivity() {
    lateinit var btn_salvar_usuario_adm : Button
    lateinit var checkbox_tipo_cont : CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editar_usuario_adm)

        btn_salvar_usuario_adm = findViewById<Button>(R.id.salvarUsuarioAdmBtn)
        checkbox_tipo_cont = findViewById<CheckBox>(R.id.contaAdmincheckBox)

        btn_salvar_usuario_adm.setOnClickListener {
            val intent = Intent(this, UsuarioAdm::class.java)
            startActivity(intent)
        }
    }
}