package com.ntgclarity.basicapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)

        val rvItems = findViewById<RecyclerView>(R.id.rv_items)

        rvItems.adapter = ItemsAdapter(
            listOf(
                "abc",
                "zxc",
                "abc",
                "zxc",
                "abc",
                "zxc",
                "abc",
                "zxc",
                "abc",
                "abc",
                "abc",
                "abc", "abc",
                "abc",
                "abc",
                "abc",
                "abc",
                "abc",
                "abc",
                "abc",
                "abc",
                "abc",
                "abc",
                "abc"
            )
        )
    }
}