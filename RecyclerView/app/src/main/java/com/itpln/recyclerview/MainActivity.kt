package com.itpln.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private var list: ArrayList<Foods> = arrayListOf()
    private lateinit var rcv_makanan : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rcv_makanan = findViewById(R.id.rcv_makanan)
        rcv_makanan.setHasFixedSize(true)

        list.addAll(FoodsData.listData)
        showRecycler()
    }

    private fun showRecycler() {
        rcv_makanan.layoutManager = LinearLayoutManager(this)
        val foodAdapter = FoodAdapter(list)
        rcv_makanan.adapter = foodAdapter
    }



//        rcv_makanan.layoutManager = LinearLayoutManager(this)
//        val foodAdapter = FoodAdapter(list)
//        rcv_makanan.adapter = foodAdapter

}