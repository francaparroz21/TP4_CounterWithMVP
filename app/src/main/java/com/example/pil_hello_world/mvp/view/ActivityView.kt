package com.example.pil_hello_world.mvp.view

import android.app.Activity
import android.content.Context
import java.lang.ref.WeakReference

open class ActivityView(act: Activity) {
    private val actRef: WeakReference<Activity> = WeakReference(act)

    val act: Activity?
        get() = actRef.get()

    val context: Context?
        get() = act

}