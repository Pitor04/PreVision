package com.example.prevision

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.prevision.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            startActivity(Intent(this, StartActivity::class.java))

            // Le agregas finish para que esta actividad muera en el flujo, es cuando inicias la otra actividad con
            // la linea número 17 hace que se instancie la otra actividad pero que no se muera esta. Con finish hace
            // que muera esta actividad en el flujo y no se puede volver a ella.
            finish()
        }
    }
}