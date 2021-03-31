package com.example.firstlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstlist.databinding.ActivityExercicio06DetalheBinding

class Exercicio06DetalheActivity : AppCompatActivity() {
    lateinit var binding: ActivityExercicio06DetalheBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExercicio06DetalheBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val image = intent.getStringExtra("image")

        when (image) {
            "Apple" -> {
                binding.imgBig.setImageResource(R.drawable.maca)
            }
            "Banana" -> {
                binding.imgBig.setImageResource(R.drawable.banana)
            }
            "Pear" -> {
                binding.imgBig.setImageResource(R.drawable.pera)
            }
        }
    }
}