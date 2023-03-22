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

    override fun setCount() {
        TODO("Not yet implemented")
    }

    override fun onClickIncreaseButton() {
        TODO("Not yet implemented")
    }

    override fun onClickDecreaseButton() {
        TODO("Not yet implemented")
    }

    override fun onClickResetButton() {
        TODO("Not yet implemented")
    }


}