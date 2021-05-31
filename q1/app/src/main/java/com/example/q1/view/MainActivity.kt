package com.example.q1.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.q1.R
import com.example.q1.controller.MyActvityViewModel
import com.example.q1.model.Items
import androidx.activity.viewModels

class MainActivity : AppCompatActivity(), ISharedActivity {
    private val _tag = "MyActvityViewModel"
    lateinit var listOfItems: List<Items>
    init {
        Log.d(_tag, "Init ####")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    val viewModel: MyActvityViewModel by viewModels()

    override fun load(){
        listOfItems = viewModel.loadItems()
        Log.d(_tag, "count of Item # ${listOfItems.size}")
        Log.d(_tag,"Showing Items # $listOfItems")

        val listOfRamdonItems = viewModel.loadRandonItems()
        Log.d(_tag, "count of Items # ${listOfRamdonItems}")
        Log.d(_tag, "Showing Items # $listOfRamdonItems")
    }

}