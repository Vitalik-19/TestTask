package com.example.testtaskandroid.ui.carrier

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.testtaskandroid.R
import kotlinx.android.synthetic.main.fragment_carrier.*

class FragmentCarrier : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_carrier, container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        text_carrier.text = "Carrier"
    }
}