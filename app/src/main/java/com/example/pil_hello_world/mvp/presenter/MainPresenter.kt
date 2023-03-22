package com.example.pil_hello_world.mvp.presenter

import com.example.pil_hello_world.mvp.contract.MainContract

class MainPresenter(private val view: MainContract.View): MainContract.Presenter {
    init {
        view.onClickButton { onClickButtonShow(view.getInputMessage()) }
    }
    override fun onClickButtonShow(name: String) {
        if (name.isBlank()) view.showEmptyMessageErrorToast()
        else view.showGreetingToast(name)
    }

    override fun onClickIncreaseButton() {
        TODO("Not yet implemented")
    }

    override fun onClickDecreaseButton() {
        TODO("Not yet implemented")
    }


}