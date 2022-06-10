package com.example.prevision

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.prevision.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.salir.setOnClickListener {
            // Finalizas la ultima actividad, por lo tanto saldrás de la aplicación.
            finish()
        }
    }
}