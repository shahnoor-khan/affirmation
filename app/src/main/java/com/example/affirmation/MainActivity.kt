package com.example.affirmation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmation.adapter.ItemAdapter
import com.example.affirmation.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //initialize data.
        val mydataset = Datasource().loadAffirmation()
        val recyclerView = findViewById<RecyclerView>(R.id.recycle_view)
        recyclerView.adapter = ItemAdapter(mydataset,this)
        //use this setting to improve performance if you know that change
        //in content do not change the layout size of the recycler view
        recyclerView.setHasFixedSize(true)


    }
}