package com.ntgclarity.basicapp.fragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ntgclarity.basicapp.R

class TwoFragmentsActivity : AppCompatActivity(), UpperFragment.UpperFragmentListener {
    private lateinit var lowerFragment: LowerFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_fragments)

        lowerFragment = LowerFragment()

        supportFragmentManager.beginTransaction()
            .add(R.id.fcv_bottom, lowerFragment)
            .commit()
    }

    override fun incrementCount() {
        lowerFragment.addOne()
    }
}