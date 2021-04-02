package com.example.firstlist

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.firstlist.databinding.ActivityExercicio03Binding

class Exercicio03Activity : AppCompatActivity() {
    lateinit var binding: ActivityExercicio03Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExercicio03Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var itens = arrayOf("Select","Personal","Professional","Others")
        var adapter = ArrayAdapter(this, R.layout.simple_spinner_item, itens)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerEmailTypes03.adapter = adapter

        itens = arrayOf("Select","WhatsApp","Telegram","Signal","Discord","Skype")
        adapter = ArrayAdapter(this, R.layout.simple_spinner_item, itens)
        adapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item)
        binding.spinnerMsgsTypes03.adapter = adapter
    }
}