package com.example.ficaforta

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ChatGemini : AppCompatActivity() {
    lateinit var btn_voltar : Button
    lateinit var btn_enviar : Button
    lateinit var menssagem_card : ConstraintLayout
    lateinit var caixa_text_editText : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_chat_gemini)

        btn_voltar = findViewById<Button>(R.id.voltarChatBtn)
        btn_enviar = findViewById<Button>(R.id.enviarMenssagemBtn)
        menssagem_card = findViewById<ConstraintLayout>(R.id.chatMenssagemConstraint)
        caixa_text_editText = findViewById<EditText>(R.id.caixaTextoEditText)

        btn_voltar.setOnClickListener {
            val intent = Intent(this, HomeUsuario::class.java)
            startActivity(intent)
        }

        btn_enviar.setOnClickListener {
            val toast = Toast.makeText(this, "mensagem enviada" , Toast.LENGTH_SHORT)
        }

        menssagem_card.setOnClickListener {
            val toast = Toast.makeText(this, "mensagem enviada as 09 horas e 11 minutos" , Toast.LENGTH_SHORT)
        }

    }
}