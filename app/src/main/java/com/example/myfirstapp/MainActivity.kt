package com.example.myfirstapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txtUsuario: EditText = findViewById(R.id.txtUsuario)
        var txtContra: EditText = findViewById(R.id.txtcontra)
        var btnValidar: Button = findViewById(R.id.btnValidar)
        var btnRegistro: Button = findViewById(R.id.btnRegistro)

        btnRegistro.setOnClickListener {
            val laotra = Intent(this, TrabajoActivity::class.java)
            startActivity(laotra)
        }
//        btnAceptarReg.setOnClickListener {
//            val nota = Intent(this, CalendarioActividades::class.java)
//            startActivity(nota)
//        }

        btnValidar.setOnClickListener {
            var aplicar = true
            if (txtUsuario.text.toString().trim().isEmpty()) {
                Toast.makeText(this, R.string.val_usuario, Toast.LENGTH_SHORT).show()
                txtUsuario.requestFocus()
                aplicar = false
            } else if (txtContra.text.toString().trim().isEmpty()) {
                Toast.makeText(this, R.string.val_contra, Toast.LENGTH_SHORT).show()
                txtContra.requestFocus()
                aplicar = false
            }

            if (aplicar) {
                Toast.makeText(this, R.string.msg_fin, Toast.LENGTH_SHORT).show()
                //llama a otra ventana
                val actividades = Intent(this, CalendarioActividades::class.java)
                startActivity(actividades)
            }

            }
        }

    }







