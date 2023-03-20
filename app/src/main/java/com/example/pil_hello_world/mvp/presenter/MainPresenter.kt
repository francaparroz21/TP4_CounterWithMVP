package com.example.pil_hello_world.mvp.presenter

import com.example.pil_hello_world.mvp.contract.MainContract

class MainPresenter(private val view: MainContract.View): MainContract.Presenter {
    override fun onClickButtonShow(text: String) {
        view.showToast(text)
    }
}