package com.julia.coderswag.Controller

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.julia.coderswag.Adapters.ProductAdapter
import com.julia.coderswag.R
import com.julia.coderswag.Services.DataService
import com.julia.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {
    lateinit var adapter : ProductAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductAdapter(this, DataService.getProducts(categoryType.toString()))

        var spamCount = 2
        val orientation = resources.configuration.orientation
        if(orientation == Configuration.ORIENTATION_LANDSCAPE){
            spamCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp
        if(screenSize > 720){
            spamCount = 3
        }
        
        val layoutManager = GridLayoutManager(this, spamCount)
        productsListView.layoutManager = layoutManager
        productsListView.adapter = adapter
    }
}