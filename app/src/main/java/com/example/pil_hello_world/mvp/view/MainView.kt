package com.example.pil_hello_world.mvp.view

import android.app.Activity
import android.widget.Toast
import com.example.pil_hello_world.R
import com.example.pil_hello_world.databinding.ActivityMainBinding
import com.example.pil_hello_world.mvp.contract.MainContract

class MainView(activity: Activity) : ActivityView(activity), MainContract.View {
    private var binding: ActivityMainBinding = ActivityMainBinding.inflate(activity.layoutInflater)

    init {
        activity.setContentView(binding.root)
    }

    override fun setCount(count: String) {
        binding.count.text = count
    }

    override fun onClickIncreaseButton(function: () -> Unit) {
        binding.increaseButton.setOnClickListener { (function()) }
    }

    override fun onClickDecreaseButton(function: () -> Unit) {
        binding.decreaseButton.setOnClickListener { (function()) }
    }

    override fun onClickResetButton(function: () -> Unit) {
        binding.resetButton.setOnClickListener { (function()) }
    }

    override fun getInsertCounter(): Int {
        return binding.insertText.text.toString().toInt()
    }

}