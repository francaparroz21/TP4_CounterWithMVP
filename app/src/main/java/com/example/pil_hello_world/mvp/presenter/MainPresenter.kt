package com.example.pil_hello_world.mvp.presenter

import com.example.pil_hello_world.mvp.contract.MainContract

class MainPresenter(private val view: MainContract.View): MainContract.Presenter {
    init {
        view.onClickButton { onClickButtonShow(view.getInputMessage()) }
    }
    override fun onClickButtonShow(text: String) {
        if (text.isBlank()) view.showErrorToast()
        else view.showToast(text)
    }


}