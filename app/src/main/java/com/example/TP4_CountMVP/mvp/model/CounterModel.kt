package com.example.TP4_CountMVP.mvp
import com.example.TP4_CountMVP.mvp.contract.CounterContract

class CounterModel() : CounterContract.Model {
    private var count = 0
    override fun setCount(acc:Int) {
        count = acc
    }

    override fun getCount(): String = count.toString()
    override fun increase(acc: Int) {
        count += acc
    }

    override fun decrease(acc: Int) {
        count -= acc
    }

    override fun reset() {
        count = 0
    }
}