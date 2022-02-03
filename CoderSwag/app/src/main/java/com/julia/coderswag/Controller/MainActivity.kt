package com.julia.coderswag.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.julia.coderswag.Adapters.CategoryRecycleAdapter
import com.julia.coderswag.R
import com.julia.coderswag.Services.DataService
import com.julia.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter:CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories) {category ->  
            val productIntent = Intent(this, ProductActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productIntent)
        }
        categoryListView.adapter = adapter

        val layoutM = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutM
        categoryListView.setHasFixedSize(true)


    }
}