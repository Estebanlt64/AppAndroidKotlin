package com.example.calculadoraapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

//Inicializar los componentes de la vista
lateinit var txtUno:TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        txtUno = findViewById(R.id.txtUno)

        txtUno.setText("hola")
        txtUno.text = ("hola")

        // sumar 2 numeros
        var resultado:Int = 0
        resultado = sumar(numUno = 2, numDos = 5)

        txtUno.text="EL resultado de la suma es $resultado"

    }

    private fun sumar(numUno: Int, numDos:Int):Int{
        return numUno + numDos
    }
}