package com.example.TP4_CountMVP.model

import com.example.TP4_CountMVP.mvp.CounterModel
import com.example.TP4_CountMVP.mvp.contract.CounterContract
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.MockK
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals


class CounterModelTest{

    @MockK
    private lateinit var model : CounterContract.Model

    @Before
    fun setup() {
        MockKAnnotations.init(this, relaxed = true)
        model = CounterModel()
    }

    @Test
    fun `we verify the increase function`(){
        model.setCount(10)
        model.increase(10)
        assertEquals("20",model.getCount())
    }

    @Test
    fun `we verify the decrease function`(){
        model.setCount(10)
        model.decrease(10)
        assertEquals("0",model.getCount())
    }

    @Test
    fun `we verify the function 'getCount()'`(){
        model.setCount(200)
        assertEquals("200", model.getCount())
    }

    @Test
    fun `we verify the reset function`(){
        model.setCount(100000)
        model.reset()
        assertEquals("0",model.getCount())
    }

}