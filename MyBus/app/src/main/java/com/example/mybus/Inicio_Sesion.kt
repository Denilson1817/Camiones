package com.example.mybus

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class InicioSesion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_sesion)
    }

    fun pasarARegistro(view: View) {
        val intent= Intent(this,Registro_Cuentas::class.java)
        startActivity(intent)
        finish()
    }

    fun leer(view: View) {

        
        val intent = Intent(this, altasJorge::class.java)
        startActivity(intent)
        finish()
    }
}