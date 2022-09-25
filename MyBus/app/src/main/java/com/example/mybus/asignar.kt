package com.example.mybus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class asignar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asignar)
    }

    fun volverInicio(view: View) {
        val intent= Intent(this,registroChoferes::class.java)
        startActivity(intent)
        finish()
    }

    fun asignarRuta(view: View) {
        val intent= Intent(this,asignarRuta::class.java)
        startActivity(intent)
        finish()
    }
    fun asignarUnidad(view: View) {
        val intent= Intent(this,asignarUnidad::class.java)
        startActivity(intent)
        finish()
    }
    fun asignarHorario(view: View) {
        val intent= Intent(this,asignarHorarios::class.java)
        startActivity(intent)
        finish()
    }


}