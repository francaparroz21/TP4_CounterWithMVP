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

    override fun showGreetingToast(name: String) {
        Toast.makeText(
            context,
            "${activity?.getString(R.string.helloToast)} $name${activity?.getString(R.string.exclamation)}",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun getInputMessage(): String {
        return binding.insertText.text.toString()
    }

    override fun onClickButton(function: () -> Unit) {
        binding.buttonShowText.setOnClickListener { function() }
    }

    override fun showEmptyMessageErrorToast() {
        Toast.makeText(
            activity,
            activity?.resources?.getString(R.string.errorToastMessage),
            Toast.LENGTH_SHORT
        ).show()
    }
}