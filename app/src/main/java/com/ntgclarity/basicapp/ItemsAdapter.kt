package com.ntgclarity.basicapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ItemsAdapter(var items: List<String>) : RecyclerView.Adapter<ItemsAdapter.ItemViewHolder>() {
    inner class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var ivPhoto: ImageView? = null
        var tvTitle: TextView? = null

        init {
            ivPhoto = view.findViewById(R.id.iv_item)
            tvTitle = view.findViewById(R.id.tv_item)

            itemView.setOnClickListener(object : View.OnClickListener {
                override fun onClick(view: View?) {
                    items = listOf(
                        "https://picsum.photos/200/200",
                        "https://picsum.photos/200/210",
                        "https://picsum.photos/300/210"
                    )

                    notifyDataSetChanged()
                }
            })
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item, parent, false)

        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        Glide.with(holder.itemView)
            .load(items[position])
            .into(holder.ivPhoto!!)

        holder.tvTitle?.text = items[position]
    }

    override fun getItemCount(): Int {
        return items.size
    }
}