package com.dicoding.picodiploma.bicyclerent

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ListBicycleAdapter(private val listBicycle: ArrayList<Bicycle>) : RecyclerView.Adapter<ListBicycleAdapter.ListViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
            val view: View = LayoutInflater.from(parent.context).inflate(R.layout.bycicle_item, parent, false)
            return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val bicycle = listBicycle[position]
        Glide.with(holder.itemView.context)
            .load(bicycle.photo)
            .into(holder.imgPhoto)
        holder.tvName.text = bicycle.name
        holder.tvCategory.text = bicycle.category
        holder.tvPrice.text = bicycle.price
    }

    override fun getItemCount(): Int {
        return listBicycle.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvCategory: TextView = itemView.findViewById(R.id.tv_category)
        var tvPrice: TextView = itemView.findViewById(R.id.tv_price)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}