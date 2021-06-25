package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var persons = listOf("Zahide Aksak", "Aydın Polat", "Kübra Aytemiş", "Kübra Karsavuran", "Muhammed Chebib","Emre Ünaldı","Muhsin Deniz","Enes Aksak", "Evin Topçi")
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,persons)
        listView.adapter = adapter
    }
}