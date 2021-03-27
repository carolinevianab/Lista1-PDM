package com.example.firstlist

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstlist.databinding.ActivityExercicio09Binding

class Exercicio09Activity : AppCompatActivity() {
    lateinit var binding: ActivityExercicio09Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExercicio09Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonNext09.setOnClickListener {
            if (binding.editValue1.text.isNotEmpty() && binding.editValue2.text.isNotEmpty()){
                val i = Intent(this, Exercicio09DetalheActivity::class.java)
                i.putExtra("value1", binding.editValue1.text.toString().toInt())
                i.putExtra("value2", binding.editValue2.text.toString().toInt())
                startActivityForResult(i, 1)
            }else{
                alert("Error", "Please, fill the value(s)", this)
            }
        }

        binding.buttonClear09.setOnClickListener {
            binding.editResult09.setText("")
            binding.editValue1.setText("")
            binding.editValue2.setText("")
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 1 && resultCode == Activity.RESULT_OK && data != null){
            val result = data.getIntExtra("result" , 0)
            binding.editResult09.setText(result.toString())
        }
    }
}