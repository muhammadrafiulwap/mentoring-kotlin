package com.udacoding.mentoringkotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.udacoding.mentoringkotlin.R
import com.udacoding.mentoringkotlin.model.Anggota

class ListviewAdapter(private val context: Context, private val data: List<Anggota>?) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view = LayoutInflater.from(parent?.context).inflate(R.layout.list_item, parent, false)

        val foto = view.findViewById<ImageView>(R.id.image)
        val nama = view.findViewById<TextView>(R.id.nama)

        val item = data?.get(position)

        foto.setImageResource(item?.foto ?: 0)
        nama.text = item?.nama

        return view

    }

    override fun getItem(position: Int): Any {
        return data?.get(position) ?: 0
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int = data?.size ?: 0

}