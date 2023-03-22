package com.example.pil_hello_world.mvp.contract

interface MainContract {
    interface View {
        fun showGreetingToast(name: String)
        fun getInputMessage(): String
        fun onClickButton(function: ()-> Unit)
        fun showEmptyMessageErrorToast()
    }

    interface Presenter {
        fun onClickButtonShow(name: String)
        fun onClickIncreaseButton()
        fun onClickDecreaseButton()
    }
}
