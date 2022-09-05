package com.ntgclarity.basicapp.fragments

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.ntgclarity.basicapp.R

class UpperFragment : Fragment(R.layout.fragment_upper) {
    var listener: UpperFragmentListener? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnAddOne: Button = view.findViewById(R.id.btn_add_one)

        btnAddOne.setOnClickListener {
            listener?.incrementCount()
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        listener = context as UpperFragmentListener
    }

    interface UpperFragmentListener {
        fun incrementCount()
    }
}