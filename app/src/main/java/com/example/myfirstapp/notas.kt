package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class notas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notas)
        var btnActividades: Button = findViewById(R.id.btnActividades)
        var btnAgregar: Button=findViewById(R.id.btnAgregarNota)


        btnAgregar.setOnClickListener {
            val Agrega = Intent(this, AgregaNota::class.java)
            startActivity(Agrega)


        btnActividades.setOnClickListener {
            val calenda = Intent(this, CalendarioActividades::class.java)
            startActivity(calenda)




            }


        }
    }
}