package com.example.androidhorizontalrecyclerapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MyHorizontalScrollViewRecyclerViewAdapter(
    private val values: ArrayList<Android>,
    private val listener: (Android) -> Unit
) : RecyclerView.Adapter<MyHorizontalScrollViewRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_item2, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val android = values[position]

        holder.bind(android)

        //Incluir al elemento el setOnClickListener
        holder.itemView.setOnClickListener { listener(android) }
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val photoView: ImageView = view.findViewById(R.id.imageViewPhoto_horizontal)
        val nameView: TextView = view.findViewById(R.id.name_list_horizontal)
        val dateView: TextView = view.findViewById(R.id.date_list_horizontal)

        override fun toString(): String {
            return super.toString() + " '" + nameView.text + "'"
        }

        fun bind(android: Android) {
            nameView.text = android.name
            dateView.text = android.date
            photoView.setImageResource(android.image)

        }
    }
}