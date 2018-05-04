package com.example.tablayoutmanytabs

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter
import com.example.rise.carecoininkotlin.HomeModule.ReceiveFragment
import com.example.rise.carecoininkotlin.HomeModule.SendFragment

class PageAdapter(fm: FragmentManager, private var tabCount: Int) :
        FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment? {

        when (position) {
            0 -> return ReceiveFragment()
            1 -> return ActiveFragment()
            2 -> return SendFragment()
            else -> return null
        }
    }

    override fun getCount(): Int {
        return tabCount
    }
}


