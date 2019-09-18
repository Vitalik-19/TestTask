package com.example.testtaskandroid.ui.porter

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.testtaskandroid.PorterAdapter
import com.example.testtaskandroid.R
import kotlinx.android.synthetic.main.fragment_porter.*

class FragmentPorter : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_porter, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val users: ArrayList<String> = ArrayList()

        for (i in 1..10) {
            users.add("Vasya#$i")
        }

        recyclerViewPorterList.layoutManager = LinearLayoutManager(Fragment().context)
        recyclerViewPorterList.adapter = PorterAdapter(users)

    }
}