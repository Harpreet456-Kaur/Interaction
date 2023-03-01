package com.example.interaction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.interaction.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var activityInterface:ActivityInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPlus.setOnClickListener {
            activityInterface.Change(1)
        }
        binding.btnMinus.setOnClickListener {
            activityInterface.Minus(1)
        }
    }
}