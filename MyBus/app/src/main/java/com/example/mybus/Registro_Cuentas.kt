package com.example.mybus

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout


class Registro_Cuentas : AppCompatActivity() {

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager
    private lateinit var viewPagerAdapter: General_Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpView()
        setUpViewPagerAdapter()
    }

    private fun setUpView() {
        tabLayout=findViewById(R.id.tabLayout)
        viewPager=findViewById(R.id.viewPager)
        viewPagerAdapter= General_Adapter(supportFragmentManager)
    }

    private fun setUpViewPagerAdapter() {
        viewPagerAdapter!!.addFragment(P_Publico_General(),"Usuario")
        viewPagerAdapter!!.addFragment(P_Administrador(),"Administrador")
        viewPagerAdapter!!.addFragment(P_Chofer(),"Chofer")
        viewPager!!.setAdapter(viewPagerAdapter)

        tabLayout!!.setupWithViewPager(viewPager)
        tabLayout!!.addOnTabSelectedListener(
            object : TabLayout.OnTabSelectedListener {
                override fun onTabSelected(p0: TabLayout.Tab?) {
                    viewPager!!.currentItem = p0!!.position
                }
                override fun onTabUnselected(p0: TabLayout.Tab?) {
                    val toast = Toast.makeText(applicationContext, "", Toast.LENGTH_SHORT)
                }

                override fun onTabReselected(p0: TabLayout.Tab?) {
                    val toast = Toast.makeText(applicationContext, "", Toast.LENGTH_LONG)
                }
            },
        )

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
