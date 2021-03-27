package com.example.firstlist

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.firstlist.databinding.ActivityExercicio09DetalheBinding

class Exercicio09DetalheActivity : AppCompatActivity() {
    lateinit var binding: ActivityExercicio09DetalheBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExercicio09DetalheBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val value1 = intent.getIntExtra("value1", 0)
        val value2 = intent.getIntExtra("value2", 0)

        binding.textValue1.setText(value1.toString())
        binding.textValue2.setText(value2.toString())

        binding.buttonSum09.setOnClickListener {
            val resultIntent = Intent()
            resultIntent.putExtra("result", (value1+value2))
            setResult(Activity.RESULT_OK, resultIntent)
            finish()
        }

        binding.buttonSub09.setOnClickListener {
            val resultIntent = Intent()
            resultIntent.putExtra("result", (value1-value2))
            setResult(Activity.RESULT_OK, resultIntent)
            finish()
        }

        binding.buttonMult09.setOnClickListener {
            val resultIntent = Intent()
            resultIntent.putExtra("result", (value1*value2))
            setResult(Activity.RESULT_OK, resultIntent)
            finish()
        }

        binding.buttonDiv09.setOnClickListener {
            val resultIntent = Intent()
            resultIntent.putExtra("result", (value1/value2))
            setResult(Activity.RESULT_OK, resultIntent)
            finish()
        }
    }
}