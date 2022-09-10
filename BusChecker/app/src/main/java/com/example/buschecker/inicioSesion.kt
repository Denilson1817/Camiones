package com.example.buschecker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class inicioSesion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_sesion)
    }

    fun pasarARegistro(view: View) {
        val intent= Intent(this,Registro::class.java)
        startActivity(intent)
        finish()
    }
}