package com.cabify.store.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cabify.store.R
import com.cabify.store.entities.Product

class ProductsAdapter(val context: Context, private val items: List<Product>): RecyclerView.Adapter<ProductsAdapter.ProductAdapterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductAdapterViewHolder {
        return ChatFragmentAdapterViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.chat_description_layout, parent, false))
    }

    override fun onBindViewHolder(holder: ProductAdapterViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {

    }

    inner class ProductAdapterViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    }
}