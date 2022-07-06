package com.cabify.store.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cabify.store.R
import com.cabify.store.databinding.ActivityMainBinding
import com.cabify.store.databinding.FragmentProductsBinding
import com.cabify.store.fragment.ProductsFragment

class MainActivity : AppCompatActivity() {

    private lateinit var _binding: ActivityMainBinding
    private val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        supportFragmentManager.beginTransaction().add(R.id.fragment, ProductsFragment()).commit()
    }
}