package com.example.TP4_CountMVP.mvp.presenter

import com.example.TP4_CountMVP.mvp.contract.CounterContract

class CounterPresenter(private val model: CounterContract.Model, private val view: CounterContract.View) :
    CounterContract.Presenter {
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