package com.example.buschecker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

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
    fun leer(view: View) {
        val editText = findViewById<EditText>(R.id.editTextTextPersonName)
        val text = editText.getText().toString()
        val editText2 = findViewById<EditText>(R.id.editTextTextPersonName2)
        val text2 = editText2.text.toString()
        val nombre = "jorge"
        val usuario = "123456"
        if(nombre.equals(text)==true && usuario.equals(text2)==true)
            Toast.makeText(this, "usuario registrado", Toast.LENGTH_SHORT).show()
        else
            Toast.makeText(this, "usuario no registrado", Toast.LENGTH_SHORT).show()
    }
}