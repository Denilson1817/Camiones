package com.example.mybus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class asignarHorarios : AppCompatActivity() {
    val choferes = arrayOf("Juan","Pancho","Maria","Panfilo")
    val entrada = arrayOf(6, 7, 8, 9, 10)
    val salida = arrayOf(6, 7, 8, 9, 10)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asignar_horarios)

        val spinnerChoferes = findViewById<Spinner>(R.id.spinnerChoferes)
        val arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,choferes)
        spinnerChoferes.adapter = arrayAdapter
        spinnerChoferes.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(applicationContext,"selecion = "+ choferes[position], Toast.LENGTH_SHORT).show()

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        val spinnerEntrada = findViewById<Spinner>(R.id.spinnerEntrada)
        val arrayAdapter1 = ArrayAdapter<Int>(this,android.R.layout.simple_spinner_dropdown_item,entrada)
        spinnerEntrada.adapter = arrayAdapter1
        spinnerEntrada.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(applicationContext,"Entrada : = "+ entrada[position] + " hrs.", Toast.LENGTH_SHORT).show()

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        val spinnerSalida = findViewById<Spinner>(R.id.spinnerSalida)
        val arrayAdapter2 = ArrayAdapter<Int>(this,android.R.layout.simple_spinner_dropdown_item,salida)
        spinnerSalida.adapter = arrayAdapter2
        spinnerSalida.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(applicationContext,"Salida : = "+ entrada[position] + " hrs.", Toast.LENGTH_SHORT).show()

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

    }

    fun volverInicio(view: View) {
        val intent= Intent(this,asignar::class.java)
        startActivity(intent)
        finish()
    }
}