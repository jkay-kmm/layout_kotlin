package com.example.layout

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.layout.databinding.ActivityMainBinding
import com.example.layout.databinding.LayoutRecyclerBinding


class RvAdapter(var ds: List<OutData_Recycler>): RecyclerView.Adapter<RvAdapter.ViewHolder>() {
    inner class ViewHolder(val binding: LayoutRecyclerBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val binding = LayoutRecyclerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        val item = ds[position]
        holder.binding.imgPhim.setImageResource(item.imgPhim)
        holder.binding.txtTenPhim.text = item.txtTenPhim
        holder.binding.txtMota.text = item.txtMota
    }

    override fun getItemCount(): Int {
        return ds.size
    }
}