package com.example.pil_hello_world.mvp.contract

interface MainContract {
    interface Model {
        fun getCount(): String
        fun increase(acc: Int)
        fun decrease(acc: Int)
        fun reset()
    }

    interface View {
        fun setCount(count: String)
        fun onClickIncreaseButton(function: () -> Unit)
        fun onClickDecreaseButton(function: () -> Unit)
        fun onClickResetButton(function: () -> Unit)
        fun getInsertCounter(): Int
        fun valueIsEmpty(): Boolean
        fun showToastErrorEmptyMessage()
    }

    interface Presenter {
        fun onClickIncreaseButton()
        fun onClickDecreaseButton()
        fun onClickResetButton()
    }
}
