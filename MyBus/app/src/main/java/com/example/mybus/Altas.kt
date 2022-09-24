package com.example.mybus

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mybus.R


class Altas : AppCompatActivity() {

    private lateinit var spnAltas: Spinner
    private lateinit var txtName: TextView
    private lateinit var txtValor: TextView
    private lateinit var inName: EditText
    private lateinit var inValor: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_altas)
        spnAltas = findViewById(R.id.spinnerAltas)
        txtName=findViewById(R.id.txtName)
        txtValor=findViewById(R.id.txtValor)
        inName=findViewById(R.id.inName)
        inValor=findViewById(R.id.inValor)
        spnAltas.adapter = ArrayAdapter.createFromResource(
            this,
            R.array.ListaAltas,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spnAltas.adapter = adapter
        }
        escuchaSpinner()
    }

    fun escuchaSpinner(){
        spnAltas.setOnItemSelectedListener(object : OnItemSelectedListener {
            override fun onItemSelected(adapterView: AdapterView<*>?, view: View, i: Int, l: Long) {
                val categoria = spnAltas.getSelectedItem()
                when (categoria){
                    "Ruta"-> {
                        txtName.setText(getString(R.string.NameVar2))
                        inName.setHint(R.string.inVar2)
                        txtValor.setText(getString(R.string.NameVar21))
                        inValor.setHint(R.string.inVar21)
                    }
                    "Tarifa"-> {
                        txtName.setText(getString(R.string.NameVar1))
                        inName.setHint(R.string.inVar1)
                        txtValor.setText(getString(R.string.NameVar11))
                        inValor.setHint(R.string.inVar11)
                    }
                }

            }

            override fun onNothingSelected(adapterView: AdapterView<*>?) {
                // No seleccionaron nada
            }
        })
    }



    fun clickSesion(view: View) {
        val intent= Intent(this,InicioSesion::class.java)
        startActivity(intent)
        finish()
    }
    fun clickCuentas(view: View) {
        val intent= Intent(this,Registro_Cuentas::class.java)
        startActivity(intent)
        finish()
    }
    fun clickReportes(view: View) {
        val intent= Intent(this,Subir_Reporte::class.java)
        startActivity(intent)
        finish()
    }

    fun clickAlta(view: View) {
        val intent= Intent(this,Altas::class.java)
        startActivity(intent)
        finish()
    }
}