package com.example.calculadoraapp.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import com.example.calculadoraapp.databinding.ActivityFrasesBinding
import com.example.calculadoraapp.model.QuoteModel
import com.example.calculadoraapp.viewmodel.QuoteViewModel

class FrasesActivity : AppCompatActivity() {
    private lateinit var binding:ActivityFrasesBinding

    private val quoteViewModel:QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding= ActivityFrasesBinding.inflate(layoutInflater)

        setContentView(binding.root)

        quoteViewModel.quoteModel.observe(this, Observer {
            binding.tvQuote.text = it.quote
            binding.tvAuthor.text = it.author
        })

        binding.viewContainer.setOnClickListener{ quoteViewModel.randomQuote() }
    }
}