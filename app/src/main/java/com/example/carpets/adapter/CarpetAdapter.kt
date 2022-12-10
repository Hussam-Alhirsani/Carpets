package com.example.carpets.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.carpets.R
import com.example.carpets.model.Carpet
import kotlinx.coroutines.NonDisposableHandle.parent

class CarpetAdapter(
    private val context:
    Context, private val dataset: List<Carpet>
) : RecyclerView.Adapter<CarpetAdapter.ViewHolder>() {

    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView : ImageView = view.findViewById(R.id.item_image)
        val textPrice: TextView = view.findViewById(R.id.item_price)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataset[position]
        holder.textPrice.text = context.resources.getString(item.price)
        holder.imageView.setImageResource(item.carpetImage)
        holder.textView.text = context.resources.getString(item.carpetDetails)



    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}