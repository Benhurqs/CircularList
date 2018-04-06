package com.benhurqs.circularlist.widget

import android.content.Context
import android.view.View

/**
 * Created by benhur.souza on 05/04/18.
 */
interface CircularListAdapter{
    fun onCreateItemView(parent: Context): View
    fun onBindView(view: View, position: Int)
    fun getItemCount() : Int
}