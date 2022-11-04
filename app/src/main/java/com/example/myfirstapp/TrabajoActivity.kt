package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TrabajoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trabajo)
        var btnAceptarReg: Button = findViewById(R.id.btnAceptarReg)

        btnAceptarReg.setOnClickListener {
            val nota = Intent(this, CalendarioActividades::class.java)
            startActivity(nota)

        }
    }
}