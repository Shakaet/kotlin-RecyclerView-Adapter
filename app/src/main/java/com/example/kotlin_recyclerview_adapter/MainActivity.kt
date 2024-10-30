package com.example.kotlin_recyclerview_adapter

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val dataList = listOf(
            DataModel("Title 1", "Description 1","Email1"),
            DataModel("Title 2", "Description 2","Email2"),
            DataModel("Title 3", "Description 3","Email3")
        )

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = MyAdapter(dataList) { item ->

            Toast.makeText(this, "Clicked: ${item.title}", Toast.LENGTH_SHORT).show()

            Toast.makeText(this,"Clicked: ${item.title}",Toast.LENGTH_SHORT).show()

            //Get data
            val bundle = Bundle().apply {
                putString("TITLE", item.title)
                putString("DESCRIPTION", item.description)
                putString("Description2",item.description2)
            }

            val intent = Intent(this, page2::class.java).apply {
                putExtras(bundle)
            }
            startActivity(intent)



        }


    }
}