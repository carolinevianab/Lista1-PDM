package com.example.firstlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.app.NotificationCompat
import com.example.firstlist.databinding.ActivityExercicio05Binding

class Exercicio05Activity : AppCompatActivity() {
    lateinit var binding: ActivityExercicio05Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExercicio05Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var result = ""
        var x = 0

        binding.button1.setOnClickListener {
            result += "1"
            binding.editResult.setText(result)
        }

        binding.button2.setOnClickListener {
            result += "2"
            binding.editResult.setText(result)
        }

        binding.button3.setOnClickListener {
            result += "3"
            binding.editResult.setText(result)
        }

        binding.button4.setOnClickListener {
            result += "4"
            binding.editResult.setText(result)
        }

        binding.button5.setOnClickListener {
            result += "5"
            binding.editResult.setText(result)
        }

        binding.button6.setOnClickListener {
            result += "6"
            binding.editResult.setText(result)
        }

        binding.button7.setOnClickListener {
            result += "7"
            binding.editResult.setText(result)
        }

        binding.button8.setOnClickListener {
            result += "8"
            binding.editResult.setText(result)
        }

        binding.button9.setOnClickListener {
            result += "9"
            binding.editResult.setText(result)
        }

        binding.button0.setOnClickListener {
            result += "0"
            binding.editResult.setText(result)
        }

        binding.buttonSum.setOnClickListener {
            if(x == 0) {
                result += "+"
                binding.editResult.setText(result)
            }
            x = 1
        }

        binding.buttonDiv.setOnClickListener {
            if(x == 0) {
                result += "/"
                binding.editResult.setText(result)
            }
            x = 1
        }

        binding.buttonSub.setOnClickListener {
            if(x == 0) {
                result += "-"
                binding.editResult.setText(result)
            }
            x = 1
        }

        binding.buttonMult.setOnClickListener {
            if(x == 0) {
                result += "*"
                binding.editResult.setText(result)
            }
            x = 1
        }

        binding.buttonErase.setOnClickListener {
            result = ""
            binding.editResult.setText(result)
            x = 0
        }

        binding.buttonEqual.setOnClickListener {
            x = 0

            if(result.contains("+")) {
                val numbers = result.split("+").toTypedArray()
                result = ((numbers[0].toInt()) + (numbers[1].toInt())).toString()
                binding.editResult.setText(result)
            }
            if(result.contains("-")) {
                val numbers = result.split("-").toTypedArray()
                result = ((numbers[0].toInt()) - (numbers[1].toInt())).toString()
                binding.editResult.setText(result)
            }
            if(result.contains("*")) {
                val numbers = result.split("*").toTypedArray()
                result = ((numbers[0].toInt()) * (numbers[1].toInt())).toString()
                binding.editResult.setText(result)
            }
            if(result.contains("/")) {
                val numbers = result.split("/").toTypedArray()
                result = ((numbers[0].toInt()) / (numbers[1].toInt())).toString()
                binding.editResult.setText(result)
            }

        }
    }
}