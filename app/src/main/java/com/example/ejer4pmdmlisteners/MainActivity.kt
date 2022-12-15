package com.example.ejer4pmdmlisteners

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import com.example.ejer4pmdmlisteners.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.mas.setOnClickListener {
            binding.editTextNumber.setText((binding.editTextNumber.text.toString().toInt() + 1).toString())
        }
        binding.menos.setOnClickListener {
            binding.editTextNumber.setText((binding.editTextNumber.text.toString().toInt() - 1).toString())
        }


       binding.editTextNumber.setOnFocusChangeListener { v, hasFocus ->
            if (hasFocus) {
                binding.mas.setBackgroundColor(Color.RED)
                binding.menos.setBackgroundColor(Color.RED)
            } else {
                binding.mas.setBackgroundColor(Color.GREEN)
                binding.menos.setBackgroundColor(Color.GREEN)
            }

        }

           if (binding.editTextNumber.text.toString().toInt() == 0) {
               binding.menos.isEnabled = false
           }







    }
}





