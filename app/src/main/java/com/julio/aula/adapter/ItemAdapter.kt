package com.julio.aula.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.julio.aula.R



    class ItemAdapter(private val stringList: ArrayList<String>) :
        RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

        // holder class to hold reference
        inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            //get view reference
            var tvItem: TextView = view.findViewById(R.id.tvItem) as TextView
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            // create view holder to hold reference
            return ViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.item_recycler_view, parent, false)
            )
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            //set values
            holder.tvItem.text = stringList[position]
        }

        override fun getItemCount(): Int {
            return stringList.size
        }

        // update your data
        fun updateData(scanResult: ArrayList<String>) {
            stringList.clear()
            notifyDataSetChanged()
            stringList.addAll(scanResult)
            notifyDataSetChanged()

        }
    }

