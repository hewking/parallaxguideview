package com.hewking.parallaxguideview

import android.support.v4.view.ViewPager
import android.view.View

/**
 * Created by test on 2018/1/16.
 */
class RotateDownTransfomer(val resid : Int) : ViewPager.PageTransformer{

    override fun transformPage(page: View, position: Float) {
        if (position < -1) {

        } else if (position > 1) {

        } else {
            // [-1,1]
            val width = page.width
            page.pivotX = width * 0.5f
            page.pivotY = page.height * 1f
            page.rotation = 30 * position



            page.alpha = 1 - Math.abs(position)
            page.scaleX = 0.7f + 0.3f * (1- Math.abs(position))

            page.v<View>(resid).translationX = position * width * 0.5f
        }

    }

}