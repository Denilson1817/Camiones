package com.example.mybus

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat


class Subir_Reporte : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subir_reporte)

        ActivityCompat.requestPermissions(
            this, arrayOf(
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.READ_EXTERNAL_STORAGE
            ),
            PackageManager.PERMISSION_GRANTED
        )
    }



    fun clickSesion(view: View) {
        val intent= Intent(this,InicioSesion::class.java)
        startActivity(intent)
        finish()
    }
    fun clickCuentas(view: View) {
        val intent= Intent(this,MainActivity::class.java)
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

    @RequiresApi(Build.VERSION_CODES.Q)
    fun clickSubirReporte(view: View) {
        val intent = Intent(Intent.ACTION_CREATE_DOCUMENT, MediaStore.Downloads.EXTERNAL_CONTENT_URI)
        intent.setType("application/pdf")
        this.startActivity(intent)}


}