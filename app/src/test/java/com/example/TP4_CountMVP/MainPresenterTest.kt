package com.example.TP4_CountMVP

import com.example.TP4_CountMVP.mvp.contract.MainContract
import com.example.TP4_CountMVP.mvp.model.CountModel
import com.example.TP4_CountMVP.mvp.presenter.MainPresenter
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.verify
import org.junit.Before
import org.junit.Test

class MainPresenterTest {

    @MockK
    private lateinit var view: MainContract.View

    private lateinit var presenter: MainContract.Presenter

    @Before
    fun setup() {
        MockKAnnotations.init(this, relaxed = true)
        presenter = MainPresenter(CountModel(), view)
    }

    @Test
    fun `we verify that when you press the increase button the counter it changes in the view`() {
        every { view.getInsertCounter() } returns 20
        every { view.valueIsEmpty() } returns false
        presenter.onClickIncreaseButton()
        verify { view.setCount("20")}
    }

    @Test
    fun `we verify that when you press the decrease button the counter it changes`() {
        every { view.valueIsEmpty() } returns false
        every { view.getInsertCounter() } returns -20
        presenter.onClickDecreaseButton()
        verify { view.setCount("20")}
    }

    @Test
    fun `if the input value is empty, throw an toast error message when the increase button is pressed`() {
        every { view.valueIsEmpty() } returns true
        presenter.onClickIncreaseButton()
        verify { view.showToastErrorEmptyMessage() }
    }

    @Test
    fun `if the input value is empty, throw an toast error message when the decrease button is pressed`() {
        every { view.valueIsEmpty() } returns true
        presenter.onClickDecreaseButton()
        verify { view.showToastErrorEmptyMessage() }
    }

    @Test
    fun `we verify that when you press the reset button, the counter changes to zero`() {
        presenter.onClickResetButton()
        verify { view.setCount("0") }
    }


}