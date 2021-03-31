package com.example.firstlist

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstlist.databinding.ActivityExercicio08Binding
import java.net.URI

class Exercicio08Activity : AppCompatActivity() {
    lateinit var binding: ActivityExercicio08Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExercicio08Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGo.setOnClickListener {
            val uri = Uri.parse(binding.editURL.text.toString())
            val i = Intent(Intent.ACTION_VIEW, uri)
            startActivity(i)
        }
    }
}