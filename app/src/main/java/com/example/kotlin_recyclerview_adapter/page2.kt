package com.example.kotlin_recyclerview_adapter

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page2)

        //Set data
        val title = intent.extras?.getString("TITLE")
        val description = intent.extras?.getString("DESCRIPTION")
        val description2=intent.extras?.getString(("Description2"))


        val titleTextView: TextView = findViewById(R.id.show_title)
        val descriptionTextView: TextView = findViewById(R.id.show_description)
        val descriptionTextView2:TextView=findViewById(R.id.textViewDescription2)


        titleTextView.text = title
        descriptionTextView.text = description
        descriptionTextView2.text=description2


    }
}