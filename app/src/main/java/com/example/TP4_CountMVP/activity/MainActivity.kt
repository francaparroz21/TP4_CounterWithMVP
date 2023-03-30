package com.example.TP4_CountMVP.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.TP4_CountMVP.mvp.CounterModel
import com.example.TP4_CountMVP.mvp.presenter.CounterPresenter
import com.example.TP4_CountMVP.mvp.view.CounterView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        CounterPresenter(CounterModel(), CounterView(this))
    }
}

