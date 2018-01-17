package com.hewking.parallaxguideview

import android.app.Activity
import android.view.View

/**
 * Created by test on 2018/1/16.
 */
fun <T : View> View.v(resid : Int) : T {
    return findViewById(resid)
}

fun <T:View> Activity.v(resid : Int) : T {
    return findViewById(resid)
}