package com.example.pil_hello_world.mvp.contract

interface MainContract {
    interface View {
        fun showToast(toast: String)
        fun getInputMessage(): String
        fun onClickButton(function: ()-> Unit)
        fun showErrorToast()
    }

    interface Presenter {
        fun onClickButtonShow(text: String)
    }
}
