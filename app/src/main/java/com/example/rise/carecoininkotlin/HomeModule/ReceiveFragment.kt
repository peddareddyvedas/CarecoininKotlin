package com.example.rise.carecoininkotlin.HomeModule

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.rise.carecoininkotlin.R

/**
 * Created by Rise on 24/04/2018.
 */
class ReceiveFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater?.inflate(R.layout.receivefragment, container, false)
    }

}