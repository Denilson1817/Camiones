package com.example.mybus.Fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.mybus.R
import com.example.mybus.databinding.FragmentMainBinding
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems


class MainFragment: Fragment(R.layout.fragment_main) {

    private lateinit var binding: FragmentMainBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)

        setupTabLayout()
    }

    private fun setupTabLayout() {
        val adapter = FragmentPagerItemAdapter(
            childFragmentManager,
            FragmentPagerItems.with(activity)
                .add("Unidad Asignada", PrimerFragment::class.java)
                .add("Horarios y tarifas", SegundoFragment::class.java)
                .add("Paradas y rutas", TercerFragment::class.java)
                .create()
        )

        binding.viewpager.adapter = adapter
        binding.viewpagertab.setViewPager(binding.viewpager)


    }
}