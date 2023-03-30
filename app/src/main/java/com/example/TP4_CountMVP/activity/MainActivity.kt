package com.example.TP4_CountMVP.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.TP4_CountMVP.mvp.model.CountModel
import com.example.TP4_CountMVP.mvp.presenter.MainPresenter
import com.example.TP4_CountMVP.mvp.view.MainView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainPresenter(CountModel(), MainView(this))
    }
}

