package com.example.pil_hello_world.mvp.view

import android.app.Activity
import android.widget.Toast
import com.example.pil_hello_world.R
import com.example.pil_hello_world.databinding.ActivityMainBinding
import com.example.pil_hello_world.mvp.contract.MainContract

class MainView(act: Activity) : ActivityView(act), MainContract.View {
    private var binding: ActivityMainBinding = ActivityMainBinding.inflate(act.layoutInflater)

    init {
        act.setContentView(binding.root)
    }

    override fun showToast(name: String) {
        Toast.makeText(context, "Hello $name!", Toast.LENGTH_SHORT).show()
    }

    override fun getInputMessage(): String {
        return binding.insertText.text.toString()
    }

    override fun onClickButton(function: () -> Unit) {
        binding.buttonShowText.setOnClickListener { function() }
    }

    override fun showErrorToast() {
        Toast.makeText(
            act,
            act!!.resources.getString(R.string.errorToastMessage),
            Toast.LENGTH_SHORT
        ).show()
    }
}