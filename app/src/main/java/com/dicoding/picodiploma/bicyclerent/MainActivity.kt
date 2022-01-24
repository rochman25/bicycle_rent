package com.dicoding.picodiploma.bicyclerent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvBicycle: RecyclerView
    private var list: ArrayList<Bicycle> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        rvBicycle = findViewById(R.id.rvBycicle)
        rvBicycle.setHasFixedSize(true)

        list.addAll(BicyclesData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvBicycle.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListBicycleAdapter(list)
        rvBicycle.adapter = listHeroAdapter
    }
}