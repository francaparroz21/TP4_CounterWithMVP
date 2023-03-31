package com.example.TP4_CountMVP.mvp.view

import android.app.Activity
import android.widget.Toast
import com.example.TP4_CountMVP.mvp.contract.CounterContract
import com.example.pil_hello_world.R
import com.example.pil_hello_world.databinding.ActivityMainBinding

class CounterView(activity: Activity) : ActivityView(activity), CounterContract.View {
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

    override fun valueIsEmpty(): Boolean {
        return binding.insertText.text.isBlank()
    }

    override fun getCounterInView(): Int {
        return binding.count.text.toString().toInt()
    }

    override fun showToastErrorEmptyMessage() {
        Toast.makeText(context, activity?.getString(R.string.errorToastMessage), Toast.LENGTH_SHORT)
            .show()
    }

    override fun showToastAlreadyResetPressed() {
        Toast.makeText(
            context,
            activity?.getString(R.string.youAlreadyResetCounter),
            Toast.LENGTH_SHORT
        )
            .show()
    }

}