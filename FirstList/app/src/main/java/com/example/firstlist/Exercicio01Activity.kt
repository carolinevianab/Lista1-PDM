package com.example.firstlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstlist.databinding.ActivityExercicio01Binding

class Exercicio01Activity : AppCompatActivity() {
    lateinit var binding: ActivityExercicio01Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExercicio01Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonFinish01.setOnClickListener {
            var typecontact = ""
            when {
                binding.checkApp.isChecked -> typecontact = "App"
                binding.checkEmail01.isChecked -> typecontact = "Email"
                binding.checkPhone01.isChecked -> typecontact = "Phone"
            }

            val msg = """Name: ${binding.editName01.text}
                |Phone Number: ${binding.editPhone01.text}
                |Email: ${binding.editEmail01.text}
                |WhatsApp: ${binding.editWhatsapp01.text}
                |Chosen type of contact: $typecontact
            """.trimMargin()

            alert("Info", msg, this)
        }
    }
}