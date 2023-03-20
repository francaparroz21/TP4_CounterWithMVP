package com.example.pil_hello_world.mvp.view

import android.app.Activity
import android.widget.Toast
import com.example.pil_hello_world.mvp.contract.MainContract

class MainView(act: Activity): ActivityView(act), MainContract.View {
    override fun showToast(toast: String) {
        Toast.makeText(context, toast, Toast.LENGTH_SHORT).show()
    }
}