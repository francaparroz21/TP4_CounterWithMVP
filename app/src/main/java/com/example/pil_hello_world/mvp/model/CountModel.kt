package com.example.pil_hello_world.mvp.model

import com.example.pil_hello_world.mvp.contract.MainContract

class CountModel : MainContract.Model {
    private var count:Int = 0
    override fun getCount(): String = count.toString()
    override fun increase() {
        count++
    }
    override fun decrease() {
        count--
    }
    override fun reset() {
        count = 0
    }
}