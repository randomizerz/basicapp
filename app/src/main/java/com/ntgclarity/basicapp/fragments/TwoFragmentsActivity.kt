package com.ntgclarity.basicapp.fragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ntgclarity.basicapp.R

class TwoFragmentsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_fragments)

        supportFragmentManager.beginTransaction()
            .add(R.id.fcv_bottom, LowerFragment())
            .commit()
    }
}