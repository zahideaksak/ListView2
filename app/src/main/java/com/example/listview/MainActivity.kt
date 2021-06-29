package com.example.listview

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AndroidException
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main2.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val persons = listOf("Zahide Aksak", "Aydın Polat", "Kübra Aytemiş", "Kübra Karsavuran", "Muhammed Chebib","Emre Ünaldı","Muhsin Deniz","Enes Aksak", "Evin Topçi")
        val mListView = findViewById<ListView>(R.id.listView)
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,persons)

        mListView.adapter = adapter

        mListView.setOnItemClickListener { parent, view, position, id ->

            CONST.position = position;
            CONST.listOfPersons = persons

            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)

        }


    }
}