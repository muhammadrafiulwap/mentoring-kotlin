package com.udacoding.mentoringkotlin.adapter

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.udacoding.mentoringkotlin.R
import com.udacoding.mentoringkotlin.model.Anggota

class AdapterRecyclerView(
    private val context: Context,
    private val data: List<Anggota>?,
    private val itemClick: OnClickListener
) : RecyclerView.Adapter<AdapterRecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)

        return ViewHolder(view);

    }

    override fun getItemCount(): Int = data?.size ?: 0

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = data?.get(position)

        holder.foto.setImageResource(item?.foto ?: 0)
        holder.nama.text = item?.nama

        holder.view.setOnClickListener {
            itemClick.detailData(item)
        }


    }

    inner class ViewHolder(val view: View) : RecyclerView.ViewHolder(view){

        var foto = view.findViewById<ImageView>(R.id.image)
        var nama = view.findViewById<TextView>(R.id.textNama)

    }

    interface OnClickListener {

        fun detailData(item: Anggota?)

    }

}