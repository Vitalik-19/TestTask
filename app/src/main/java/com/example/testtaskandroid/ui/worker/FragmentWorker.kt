package com.example.testtaskandroid.ui.worker

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.testtaskandroid.R
import kotlinx.android.synthetic.main.fragment_worker.*

class FragmentWorker : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_worker, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        text_worker.text = "Worker"
    }
}