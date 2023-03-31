package com.example.TP4_CountMVP.presenter
import com.example.TP4_CountMVP.mvp.CounterModel
import com.example.TP4_CountMVP.mvp.contract.CounterContract
import com.example.TP4_CountMVP.mvp.presenter.CounterPresenter
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.verify
import org.junit.Before
import org.junit.Test

class CounterPresenterTest {

    @MockK
    private lateinit var view: CounterContract.View

    private lateinit var presenter: CounterContract.Presenter

    @Before
    fun setup() {
        MockKAnnotations.init(this, relaxed = true)
        presenter = CounterPresenter(CounterModel(), view)
    }

    @Test
    fun `we verify that when you press the increase button the counter it changes in the view`() {
        every { view.getInsertCounter() } returns 20
        every { view.valueIsEmpty() } returns false
        presenter.onClickIncreaseButton()
        verify { view.setCount("20") }
    }

    @Test
    fun `we verify that when you press the decrease button the counter it changes`() {
        every { view.valueIsEmpty() } returns false
        every { view.getInsertCounter() } returns -20
        presenter.onClickDecreaseButton()
        verify { view.setCount("20") }
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
        every { view.getCounterInView() } returns 10
        presenter.onClickResetButton()
        verify { view.setCount("0") }
    }

    @Test
    fun `throw toast 'you already reset' when the counter is at 0 and is pressed the reset button`() {
        every { view.getCounterInView() } returns 0
        presenter.onClickResetButton()
        verify { view.showToastAlreadyResetPressed() }
    }


}