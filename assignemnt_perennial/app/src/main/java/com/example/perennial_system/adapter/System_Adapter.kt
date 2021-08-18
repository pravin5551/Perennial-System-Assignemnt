package com.example.perennial_system.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.perennial_system.R
import com.example.perennial_system.model.Data
import com.example.perennial_system.model.Response_class
import com.example.perennial_system.viewholder.System_ViewHolder
class System_Adapter(private var dataList: List<Data>) : RecyclerView.Adapter<System_ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): System_ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return System_ViewHolder(view)
    }

    override fun onBindViewHolder(holder: System_ViewHolder, position: Int) {
        val dataClass = dataList[position]
        holder.setData(dataClass)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

}

