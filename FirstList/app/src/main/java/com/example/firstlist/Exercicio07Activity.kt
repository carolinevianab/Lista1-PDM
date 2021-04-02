package com.example.firstlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstlist.databinding.ActivityExercicio07Binding

class Exercicio07Activity : AppCompatActivity() {
    lateinit var binding: ActivityExercicio07Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExercicio07Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonDetail07.setOnClickListener {
            if(binding.editName07.text.isNotEmpty() && binding.editLastName07.text.isNotEmpty()) {
                val i = Intent(this, Exercicio07DetalheActivity::class.java)
                i.putExtra("name", binding.editName07.text.toString())
                i.putExtra("lastName", binding.editLastName07.text.toString())
                startActivity(i)
            }else{
                alert("Error", "Please, fill the box(es)", this)
            }

            binding.editName07.setText("")
            binding.editLastName07.setText("")
        }

    }
}