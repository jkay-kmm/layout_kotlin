package com.example.layout

import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(val activity: MainActivity, val list: List<OutData>): ArrayAdapter<OutData>(activity, R.layout.list_item, list) {
    override fun getCount(): Int {
        return list.size
    }

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup
    ): View {
        val contexs = activity.layoutInflater
        val rowView = contexs.inflate(R.layout.list_item, parent, false)

        // khai bao bien
        val images = rowView.findViewById<ImageView>(R.id.images)
        val title = rowView.findViewById<TextView>(R.id.title)
        val desc = rowView.findViewById<TextView>(R.id.desc)

        title.text = list[position].title
        desc.text = list[position].desc
        images.setImageResource(list[position].images)


        return rowView
    }
}