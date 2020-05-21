package com.udacoding.mentoringkotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.udacoding.mentoringkotlin.R
import com.udacoding.mentoringkotlin.model.CobaModel

class CobaAdapter (var data: List<CobaModel>?) : RecyclerView.Adapter<CobaAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_coba, parent, false)

        return ViewHolder(view)

    }

    override fun getItemCount(): Int = data?.size ?: 0

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = data?.get(position)

        holder.gambar1.setImageResource(item?.image1 ?: R.drawable.new_label)
        holder.gambar2.setImageResource(item?.image2 ?: R.drawable.udacoding)
        holder.desk.text = item?.deskripsi

    }


    inner class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

        val gambar1 = view.findViewById<ImageView>(R.id.image1)
        val gambar2 = view.findViewById<ImageView>(R.id.image2)
        val desk = view.findViewById<TextView>(R.id.deskripsi)

    }

}