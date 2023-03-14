package com.example.pil_hello_world

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pil_hello_world.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.title.text = getString(R.string.title)
        binding.buttonShowText.setOnClickListener {
            Toast.makeText(this, binding.insertText.text, Toast.LENGTH_SHORT).show()
        }
    }
}
