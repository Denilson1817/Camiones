package com.example.mybus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class asignarUnidad : AppCompatActivity() {
    val choferes = arrayOf("Juan","Pancho","Maria","Panfilo")
    val unidades = arrayOf(1,2,3,4,5,6,7)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asignar_unidad)

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

        val spinnerUnidades = findViewById<Spinner>(R.id.spinnerUnidades)
        val arrayAdapter1 = ArrayAdapter<Int>(this,android.R.layout.simple_spinner_dropdown_item,unidades)
        spinnerUnidades.adapter = arrayAdapter1
        spinnerUnidades.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(applicationContext,"Unidad seleccionada = "+ unidades[position], Toast.LENGTH_SHORT).show()

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