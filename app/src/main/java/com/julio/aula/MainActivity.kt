package com.julio.aula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.julio.aula.adapter.ItemAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var mAdapter : ItemAdapter
    private lateinit var mRecyclerView : RecyclerView
    private lateinit var mButton : FloatingActionButton

    private var counter : Int = 0

    private val mList = ArrayList<String>()

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            mRecyclerView = findViewById(R.id.rvList)
            mButton = findViewById(R.id.floatingActionButton2)
            mAdapter = ItemAdapter(mList)
            mRecyclerView.adapter = mAdapter
            mButton.setOnClickListener {
                counter++
                mList.add("item $counter")
                mAdapter.notifyItemInserted(counter -1)
            }
    }

}