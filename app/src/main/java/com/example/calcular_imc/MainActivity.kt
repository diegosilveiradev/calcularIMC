package com.example.calcular_imc

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

   private lateinit var editTextPeso: EditText
   private lateinit var editTextAltura: EditText
   private lateinit var button: Button
   private lateinit var editResultado : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextPeso = findViewById(R.id.peso)
        editTextAltura = findViewById(R.id.altura)
        button = findViewById(R.id.button)
        editResultado = findViewById(R.id.editResultado)

        button.setOnClickListener {
            val peso: Double = editTextPeso.text.toString().toDouble()
            val altura: Double = editTextAltura.text.toString().toDouble()
            val imc = peso / (altura * altura)
            val imcformact = String.format("%.2f",imc)
            editResultado.text = imcformact
        }
    }
}
