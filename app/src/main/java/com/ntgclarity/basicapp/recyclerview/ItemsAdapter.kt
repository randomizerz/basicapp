package com.ntgclarity.basicapp.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ntgclarity.basicapp.R
import com.ntgclarity.basicapp.news.Article

class ItemsAdapter(var items: List<Article?>?) :
    RecyclerView.Adapter<ItemsAdapter.ItemViewHolder>() {
    inner class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var ivPhoto: ImageView? = null
        var tvTitle: TextView? = null

        init {
            ivPhoto = view.findViewById(R.id.iv_item)
            tvTitle = view.findViewById(R.id.tv_item)

            itemView.setOnClickListener(object : View.OnClickListener {
                override fun onClick(view: View?) {
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
        val article = items?.get(position)

        Glide.with(holder.itemView)
            .load(article?.urlToImage)
            .into(holder.ivPhoto!!)

        holder.tvTitle?.text = article?.title
    }

    override fun getItemCount(): Int {
        return items?.size ?: 0
    }
}