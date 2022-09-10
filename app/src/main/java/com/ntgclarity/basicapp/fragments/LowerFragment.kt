package com.ntgclarity.basicapp.fragments

import android.content.SharedPreferences
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.ntgclarity.basicapp.R

class LowerFragment : Fragment(R.layout.fragment_lower) {
    var count = 0
    var tvCount: TextView? = null
    lateinit var prefs: SharedPreferences
    val kCount = "count"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvCount = view.findViewById(R.id.tv_count)

        prefs = PreferenceManager.getDefaultSharedPreferences(requireContext())

        count = prefs.getInt(kCount, 0)
        tvCount?.text = "$count"
    }

    fun addOne() {
        count++

        prefs.edit()
            .putInt(kCount, count)
            .apply()

        tvCount?.text = "$count"
    }
}