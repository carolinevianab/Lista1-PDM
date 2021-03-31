package com.example.firstlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstlist.databinding.ActivityExercicio01Binding
import com.example.firstlist.databinding.ActivityExercicio02Binding

class Exercicio02Activity : AppCompatActivity() {
    lateinit var binding: ActivityExercicio02Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExercicio02Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.editNameEx2.isEnabled = false
        binding.editPhoneEx2.isEnabled = false
        binding.editEmailEx2.isEnabled = false
        binding.editWhatsEx2.isEnabled = false

        binding.checkPhoneEx2.setOnCheckedChangeListener { buttonView, isChecked ->
            binding.editNameEx2.isEnabled = isChecked
            binding.editPhoneEx2.isEnabled = isChecked
            binding.editWhatsEx2.isEnabled = isChecked
        }
        binding.checkEmailEx2.setOnCheckedChangeListener { buttonView, isChecked ->
            binding.editEmailEx2.isEnabled = isChecked
        }
        binding.checkAppEx2.setOnCheckedChangeListener { buttonView, isChecked ->
            binding.editNameEx2.isEnabled = isChecked
        }

        binding.btnFinishEx2.setOnClickListener {
            var msg = ""
            if (binding.checkPhoneEx2.isChecked && binding.editNameEx2.text.isNotBlank() && (binding.editPhoneEx2.text.isNotBlank() || binding.editWhatsEx2.text.isNotBlank())) {
                msg = """Name: ${binding.editNameEx2.text}
                |Phone Number: ${binding.editPhoneEx2.text}
                |Email: ${binding.editEmailEx2.text}
                |WhatsApp: ${binding.editWhatsEx2.text}
                |Chosen type of contact: "Phone"
                """.trimMargin()
            }
            else if (binding.checkEmailEx2.isChecked && binding.editEmailEx2.text.isNotBlank()) {
                msg = """Name: ${binding.editNameEx2.text}
                |Phone Number: ${binding.editPhoneEx2.text}
                |Email: ${binding.editEmailEx2.text}
                |WhatsApp: ${binding.editWhatsEx2.text}
                |Chosen type of contact: "Email"
                """.trimMargin()
            }
            else if (binding.checkAppEx2.isChecked && binding.editNameEx2.text.isNotBlank()) {
                msg = """Name: ${binding.editNameEx2.text}
                |Phone Number: ${binding.editPhoneEx2.text}
                |Email: ${binding.editEmailEx2.text}
                |WhatsApp: ${binding.editWhatsEx2.text}
                |Chosen type of contact: "Phone"
                """.trimMargin()
            }
            else {
                msg = "There is one or more blank fields"
            }

            alert("Info", msg, this)

        }


    
    }
}