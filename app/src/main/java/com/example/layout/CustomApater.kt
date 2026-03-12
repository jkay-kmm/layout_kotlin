package com.example.layout

import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(val activity: MainActivity, val list: List<OutData>) : ArrayAdapter<OutData>(activity, R.layout.list_item, list) {
    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup
    ): View {
        val contexs = activity.layoutInflater
        // layoutÌnlater là 1 componnent giúp chuyển đổi layout xml sang view
        val rowView = contexs.inflate(R.layout.list_item, parent, false)
        val image = rowView.findViewById<ImageView>(R.id.img)
        val txt1 = rowView.findViewById<TextView>(R.id.txt1)
        val txt2 = rowView.findViewById<TextView>(R.id.tx2)
        txt1.text = list[position].txt1
        txt2.text = list[position].txt2
        image.setImageResource(list[position].img)

        return rowView
    }

    override fun getCount(): Int {
        return list.size // vẽ lên view hết tất cả các dòng của list
    }
}