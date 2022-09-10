package com.example.buschecker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
    }

    fun volverInicio(view: View) {
        val intent= Intent(this,inicioSesion::class.java)
        startActivity(intent)
        finish()
    }
}