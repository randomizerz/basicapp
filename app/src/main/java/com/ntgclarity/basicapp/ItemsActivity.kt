package com.ntgclarity.basicapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class ItemsActivity : AppCompatActivity() {
    private var adapter: ItemsAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)

        val rvItems = findViewById<RecyclerView>(R.id.rv_items)

        adapter = ItemsAdapter(
            listOf(
                "https://picsum.photos/200/300",
                "https://picsum.photos/200/310"
            )
        )
        rvItems.adapter = adapter
    }

//    override fun onResume() {
//        super.onResume()
//
//        adapter?.items = listOf(
//            "https://picsum.photos/200/200",
//            "https://picsum.photos/200/210",
//            "https://picsum.photos/300/210"
//        )
//    }
}