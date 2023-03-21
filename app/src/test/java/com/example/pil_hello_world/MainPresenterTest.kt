package com.example.pil_hello_world

import com.example.pil_hello_world.mvp.contract.MainContract
import com.example.pil_hello_world.mvp.presenter.MainPresenter
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.MockK
import io.mockk.verify
import org.junit.Before
import org.junit.Test

class MainPresenterTest {

    private lateinit var presenter: MainContract.Presenter

    @MockK
    private lateinit var view: MainContract.View

    @Before
    fun setup(){
        MockKAnnotations.init(this, relaxed = true)
        presenter = MainPresenter(view)
    }

    @Test
    fun `we verify that when you press the presenter button it show up in view`(){
        presenter.onClickButtonShow("hello world")
        verify { view.showGreetingToast("hello world") }
    }

    @Test
    fun `we verify that when an empty text is entered we will get the error message`(){
        presenter.onClickButtonShow("             ")
        verify { view.showEmptyMessageErrorToast() }
    }
}