package com.benhurqs.circleconstrainlayout.sample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.benhurqs.circleconstrainlayout.ItemObj
import com.benhurqs.circleconstrainlayout.R
import com.benhurqs.circularlist.widget.CircularListAdapter

/**
 * Created by benhursouza on 06/04/18.
 */
class SampleAdapter(private val myDataset: List<ItemObj>): CircularListAdapter {

    override fun onCreateItemView(parent: Context): View {
        // create a new view
        return LayoutInflater.from(parent).inflate(R.layout.item_list, null)
    }

    override fun onBindView(view: View, position: Int) {
        var itemobj = myDataset[position]
        (view.findViewById<View>(R.id.img) as ImageView).setImageResource(itemobj.img)
        (view.findViewById<View>(R.id.text) as TextView).text = itemobj.text
    }

    override fun getItemCount() = myDataset.size
}