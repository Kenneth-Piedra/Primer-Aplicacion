package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class CalendarioActividades : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendario_actividades)
        var btnNotas: Button = findViewById(R.id.btnNotas)

        btnNotas.setOnClickListener {
            val notas1 = Intent(this, notas::class.java)
            startActivity(notas1)


        }
    }
}