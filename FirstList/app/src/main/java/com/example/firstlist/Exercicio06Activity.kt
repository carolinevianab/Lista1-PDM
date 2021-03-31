package com.example.firstlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstlist.databinding.ActivityExercicio06Binding

class Exercicio06Activity : AppCompatActivity() {
    lateinit var binding: ActivityExercicio06Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExercicio06Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var i = Intent(this, Exercicio06DetalheActivity::class.java)

        binding.photoApple.setOnClickListener {
            i.putExtra("image", "Apple")
            startActivity(i)
        }
        binding.photoBanana.setOnClickListener {
            i.putExtra("image", "Banana")
            startActivity(i)
        }
        binding.photoPear.setOnClickListener {
            i.putExtra("image", "Pear")
            startActivity(i)
        }
    }
}