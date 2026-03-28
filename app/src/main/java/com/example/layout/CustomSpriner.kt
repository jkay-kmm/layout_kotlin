package com.example.layout

import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomSpriner (val activity: MainActivity, val list: List<OutData>) : ArrayAdapter<OutData>(activity, R.layout.list_monan, list){
    override fun getCount(): Int {
        return list.size
    }

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup
    ): View {
        return initView(position, convertView, parent)
    }

    override fun getDropDownView(
        position: Int,
        convertView: View?,
        parent: ViewGroup
    ): View? {
        return initView(position, convertView, parent)
    }
    // ham xu ly
    private fun initView(position: Int, convertView: View?, parent: ViewGroup): View{
        val contest = activity.layoutInflater
        val rowView = contest.inflate(R.layout.list_monan, parent, false)
        // khai bao
        val images = rowView.findViewById<ImageView>(R.id.images)
        val txt = rowView.findViewById<TextView>(R.id.txt)
        // anh xa
        images.setImageResource(list[position].image)
        txt.text = list[position].txt

        return rowView
    }
}