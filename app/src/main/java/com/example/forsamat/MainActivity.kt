package com.example.forsamat

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.forsamat.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var counter = 0
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }


    override fun onResume() {
        super.onResume()
        counter++
        if (counter%2==0) {
            binding.text.setTextColor(Color.GREEN)
        } else {
            binding.text.setTextColor(Color.CYAN)
        }
    }

}