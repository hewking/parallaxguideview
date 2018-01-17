package com.hewking.parallaxguideview

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewpager = v<ViewPager>(R.id.viewpager)

        val fragments = mutableListOf<Fragment>()
        fragments.add(FragmentOne())
        fragments.add(FragmentTwo())
        fragments.add(FragmentThree())

        viewpager.setPageTransformer(true,RotateDownTransfomer(R.id.iv_parallax))

        val adapter = GuidePagerAdapter(supportFragmentManager,fragments)
        viewpager.adapter = adapter

//        val gest = object : GestureDetector(){
//            override fun onTouchEvent(ev: MotionEvent?): Boolean {
//                return super.onTouchEvent(ev)
//            }
//        }

    }

    inner class GuidePagerAdapter(fm: FragmentManager?,val fragments : MutableList<Fragment>) : FragmentStatePagerAdapter(fm) {

        override fun getItem(position: Int): Fragment = fragments[position]

        override fun getCount(): Int {
            return 3
        }

    }
}
