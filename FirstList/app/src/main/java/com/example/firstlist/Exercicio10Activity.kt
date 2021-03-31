package com.example.firstlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstlist.databinding.ActivityExercicio10Binding

class Exercicio10Activity : AppCompatActivity() {
    lateinit var binding: ActivityExercicio10Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExercicio10Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEx1.setOnClickListener {
            val i = Intent(this, Exercicio01Activity::class.java)
            startActivity(i)
        }
        binding.btnEx2.setOnClickListener {
            val i = Intent(this, Exercicio02Activity::class.java)
            startActivity(i)
        }
        binding.btnEx3.setOnClickListener {
            val i = Intent(this, Exercicio03Activity::class.java)
            startActivity(i)
        }
        binding.btnEx4.setOnClickListener {
            val i = Intent(this, Exercicio04Activity::class.java)
            startActivity(i)
        }
        binding.btnEx5.setOnClickListener {
            val i = Intent(this, Exercicio05Activity::class.java)
            startActivity(i)
        }
        binding.btnEx6.setOnClickListener {
            val i = Intent(this, Exercicio06Activity::class.java)
            startActivity(i)
        }
        binding.btnEx7.setOnClickListener {
            val i = Intent(this, Exercicio07Activity::class.java)
            startActivity(i)
        }
        binding.btnEx8.setOnClickListener {
            val i = Intent(this, Exercicio08Activity::class.java)
            startActivity(i)
        }
        binding.btnEx9.setOnClickListener {
            val i = Intent(this, Exercicio09Activity::class.java)
            startActivity(i)
        }
        binding.btnEx10.setOnClickListener {
            alert("Hey :D", "This is exercise 10 :D", this)
        }
    }
}