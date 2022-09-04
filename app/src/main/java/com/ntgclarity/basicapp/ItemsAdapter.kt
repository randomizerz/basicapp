package com.ntgclarity.basicapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemsAdapter(val items: List<String>) : RecyclerView.Adapter<ItemsAdapter.ItemViewHolder>() {
    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var ivPhoto: ImageView? = null
        var tvTitle: TextView? = null

        init {
            ivPhoto = view.findViewById(R.id.iv_item)
            tvTitle = view.findViewById(R.id.tv_item)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item, parent, false)

        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.tvTitle?.text = items[position]
    }

    override fun getItemCount(): Int {
        return items.size
    }
}