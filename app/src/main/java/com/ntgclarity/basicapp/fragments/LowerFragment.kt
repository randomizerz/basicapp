package com.ntgclarity.basicapp.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.ntgclarity.basicapp.R

class LowerFragment : Fragment(R.layout.fragment_lower) {
    var count = 0
    var tvCount: TextView? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvCount = view.findViewById(R.id.tv_count)
    }

    fun addOne() {
        count++
        tvCount?.text = "$count"
    }
}