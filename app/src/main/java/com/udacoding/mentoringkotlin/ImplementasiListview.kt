package com.udacoding.mentoringkotlin

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.udacoding.mentoringkotlin.adapter.ListviewAdapter
import com.udacoding.mentoringkotlin.model.Anggota
import kotlinx.android.synthetic.main.activity_implementasi_listview.*

class ImplementasiListview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implementasi_listview)

        val listAnggota = ArrayList<Anggota>()
        listAnggota.add(Anggota("Rafi",8345678,R.drawable.udacoding,"Jakarta"))
        listAnggota.add(Anggota("Ulwa",8345678,R.drawable.udacoding,"Padang"))
        listAnggota.add(Anggota("Pratama",8345678,R.drawable.udacoding,"Makasar"))
        listAnggota.add(Anggota("MRUP",8345678,R.drawable.udacoding,"Palembang"))

        val adapter = ListviewAdapter(this, listAnggota)
        list.adapter = adapter

        list.setOnItemClickListener { parent, view, position, id ->

            Dialog(this).apply {
                requestWindowFeature(Window.FEATURE_NO_TITLE)
                setCancelable(true)
                setContentView(R.layout.detail_list_item)

                val image = this.findViewById<ImageView>(R.id.image)
                val nama = this.findViewById<TextView>(R.id.textNama)
                val nohp = this.findViewById<TextView>(R.id.textNohp)
                val alamat = this.findViewById<TextView>(R.id.textAlamat)
                val close = this.findViewById<Button>(R.id.close)

                val item = listAnggota.get(position)

                image.setImageResource(item.foto)
                nama.text = "Nama  : ${item.nama}"
                nohp.text = "No Hp : ${item.nohp}"
                alamat.text = "Alamat : ${item.alamat}"

                close.setOnClickListener {
                    this.dismiss()
                }

            }.show()

        }

    }
}
