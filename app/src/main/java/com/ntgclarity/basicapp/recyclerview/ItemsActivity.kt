package com.ntgclarity.basicapp.recyclerview

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.ntgclarity.basicapp.R
import com.ntgclarity.basicapp.news.Everything
import com.ntgclarity.basicapp.news.service
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

const val kNewsApiKey = ""

class ItemsActivity : AppCompatActivity() {
    private var adapter: ItemsAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)

        val rvItems = findViewById<RecyclerView>(R.id.rv_items)

        adapter = ItemsAdapter(listOf())
        rvItems.adapter = adapter

        requestEverything()
    }

    private fun requestEverything() {
        // start progress view

        service.everything("bitcoin", kNewsApiKey)
            .enqueue(object : Callback<Everything> {
                override fun onResponse(call: Call<Everything>, response: Response<Everything>) {
                    if (response.isSuccessful) {
                        //val titles = response.body()?.articles?.map { it.title }

                        adapter?.items = response.body()?.articles
                        adapter?.notifyDataSetChanged()
                    }

                    // end progress view
                }

                override fun onFailure(call: Call<Everything>, t: Throwable) {
                    Toast.makeText(this@ItemsActivity, t.localizedMessage, Toast.LENGTH_SHORT)
                        .show()

                    // end progress view
                }
            })
    }
}