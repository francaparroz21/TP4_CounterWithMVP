package com.example.pil_hello_world.mvp.contract

interface MainContract {
    interface Model {
        fun getCount(): String
        fun increase()
        fun decrease()
        fun reset()
    }

    interface View {
        fun setCount(count: String)
        fun onClickIncreaseButton(function: () -> Unit)
        fun onClickDecreaseButton(function: () -> Unit)
        fun onClickResetButton(function: () -> Unit)
    }

    interface Presenter {
        fun onClickIncreaseButton()
        fun onClickDecreaseButton(count: String)
    }
}
