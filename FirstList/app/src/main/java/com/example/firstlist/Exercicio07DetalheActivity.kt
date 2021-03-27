package com.example.firstlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstlist.databinding.ActivityExercicio07DetalheBinding

class Exercicio07DetalheActivity : AppCompatActivity() {
    lateinit var binding: ActivityExercicio07DetalheBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExercicio07DetalheBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val lastName = intent.getStringExtra("lastName")
        val msg = """Welcome
            |${name} ${lastName}
            |I hope you have a great day :)
        """.trimMargin()

        alert("Detail", msg, this)

        binding.buttonBack07.setOnClickListener {
            finish()
        }
    }
}