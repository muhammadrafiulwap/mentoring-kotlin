package com.udacoding.mentoringkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.udacoding.mentoringkotlin.adapter.CobaAdapter
import com.udacoding.mentoringkotlin.model.CobaModel
import kotlinx.android.synthetic.main.activity_coba_recyleview.*

class CobaRecyleview : AppCompatActivity() {

    var data : ArrayList<CobaModel>? = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coba_recyleview)

        data?.add(CobaModel(R.drawable.new_label, R.drawable.udacoding, "Deskripsi data satu"))
        data?.add(CobaModel(R.drawable.labe2, R.drawable.udacoding, "Deskripsi data dua"))
        data?.add(CobaModel(R.drawable.new_label, R.drawable.udacoding, "Deskripsi data tiga"))
        data?.add(CobaModel(R.drawable.labe2, R.drawable.udacoding, "Deskripsi data empat"))
        data?.add(CobaModel(R.drawable.new_label, R.drawable.udacoding, "Deskripsi data lima"))

        list.adapter = CobaAdapter(data)

    }
}
