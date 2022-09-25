package com.example.mybus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class altasJorge : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_altas_jorge)
    }

    fun volverInicio(view: View) {
        val intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun agregarRuta(view: View) {}
    fun agregarUnidad(view: View) {
        val intent= Intent(this,altaUnidad::class.java)
        startActivity(intent)
        finish()
    }

    fun agregarTarifa(view: View) {}
    fun agregarChofer(view: View) {}



}