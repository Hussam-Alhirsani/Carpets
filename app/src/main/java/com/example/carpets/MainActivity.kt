package com.example.carpets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.carpets.adapter.CarpetAdapter
import com.example.carpets.data.DataSource
import com.example.carpets.model.Carpet

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val textView : TextView = findViewById(R.id.tx1)
        // textView.text = DataSource().loadcarpet().size.toString()

        val dataset = DataSource().loadcarpet()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val adapter = CarpetAdapter(this, dataset)

        recyclerView.adapter = adapter

        recyclerView.setHasFixedSize(true)

    }

}