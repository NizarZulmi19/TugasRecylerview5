package com.nizar.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val list = ArrayList<Obat>()
    val listname = arrayOf(
        "Mixagrip",
        "Panadol",
            "Enervonc",
            "Esterc",
            "Antangin",
            "Tolakangin",
            "Paracetamol"

    )

    val listdesc = arrayOf(
        "Mixagrip Merupakan Obat Flu dan Batuk",
        "Panadol Merupakan Obat Sakit Kepala",
            "Enervon C adalah Suplemen Multivitamin",
            "Ester C Merupakan Obat Suplemen Vitamin",
            "Antangin meredakan masuk angin",
            "Tolak angin mengurangi pegal - pegal dan masuk angin",
            "Paracetamol Meredakan Panas"


    )

    val obatnya = intArrayOf(
        R.drawable.mixagrip,
        R.drawable.panadol,
            R.drawable.enervonc,
            R.drawable.esterc,
            R.drawable.antangin,
            R.drawable.tolakangin,
            R.drawable.paracetamol
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        RecyclerView.setHasFixedSize(true)
        RecyclerView.layoutManager = LinearLayoutManager(this)
        for (i in 0 until listname.size) {
            list.add(Obat(listname.get(i), listdesc.get(i), obatnya.get(i)))
            if (listname.size - 1 == i  ) {
                val adapter = Adapter(list)
                adapter.notifyDataSetChanged()
                RecyclerView.adapter = adapter
            }
        }
    }
}