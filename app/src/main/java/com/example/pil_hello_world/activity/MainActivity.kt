package com.example.pil_hello_world.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pil_hello_world.mvp.presenter.MainPresenter
import com.example.pil_hello_world.mvp.view.MainView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainPresenter(MainView(this))
    }
}

