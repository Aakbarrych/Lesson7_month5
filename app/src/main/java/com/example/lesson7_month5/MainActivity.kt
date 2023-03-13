package com.example.lesson7_month5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson7_month5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()
    }

    private fun initClickers() {
        with(binding){
            calculate.setOnClickListener {
                resultTv.text = Math().add(firstEd.text.toString(), secondEd.text.toString())
            }
            divide.setOnClickListener {
                resultTv.text = Math().divide(firstEd.text.toString(), secondEd.text.toString())
            }
        }
    }
}