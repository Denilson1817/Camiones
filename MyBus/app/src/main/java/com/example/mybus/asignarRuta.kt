package com.example.mybus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class asignarRuta : AppCompatActivity() {
    val choferes = arrayOf("Juan","Pancho","Maria","Panfilo")
    val rutas = arrayOf("R-01", "R-02", "R-03")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asignar_ruta)

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

        val spinnerRutas = findViewById<Spinner>(R.id.spinnerRutas)
        val arrayAdapter1 = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,rutas)
        spinnerRutas.adapter = arrayAdapter1
        spinnerRutas.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(applicationContext,"Ruta seleccionada = "+ rutas[position], Toast.LENGTH_SHORT).show()

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