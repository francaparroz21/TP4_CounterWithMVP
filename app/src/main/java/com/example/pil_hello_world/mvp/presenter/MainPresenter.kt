package com.example.pil_hello_world.mvp.presenter

import android.widget.Toast
import com.example.pil_hello_world.mvp.contract.MainContract

class MainPresenter(private val model: MainContract.Model, private val view: MainContract.View) :
    MainContract.Presenter {
    init {
        view.onClickIncreaseButton { onClickIncreaseButton() }
        view.onClickDecreaseButton { onClickDecreaseButton() }
        view.onClickResetButton { onClickResetButton() }
    }

    override fun onClickIncreaseButton() {
        if (view.valueIsEmpty()) {
            view.showToastErrorEmptyMessage()
        }else{
            model.increase(view.getInsertCounter())
            view.setCount(model.getCount())
        }
    }

    override fun onClickDecreaseButton() {
        if (view.valueIsEmpty()) {
            view.showToastErrorEmptyMessage()
        }else{
            model.decrease(view.getInsertCounter())
            view.setCount(model.getCount())
        }
    }

    override fun onClickResetButton() {
        model.reset()
        view.setCount(model.getCount())
    }


}