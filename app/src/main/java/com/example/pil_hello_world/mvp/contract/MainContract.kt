package com.example.pil_hello_world.mvp.contract

interface MainContract {
    interface View {
        fun showToast(toast: String)
    }

    interface Presenter {
        fun onClickButtonShow(text: String)
    }
}
