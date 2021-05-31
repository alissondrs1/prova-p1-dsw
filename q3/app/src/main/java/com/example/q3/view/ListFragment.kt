package com.example.q3.view

import android.util.Log
import com.example.q3.controller.ListViewModel
import com.example.q3.model.EMail

class ListFragment: ISharedFragment() {

    private val  viewModel: ListViewModel by viewModels()
    lateinit var listOfEmail: List<EMail>
    private val _tag = "ListFragment"


    override fun load() {
        // 3. Connect Recycler View with Adapter
        listOfEmail = viewModel.loadEmail()
        Log.d(_tag, "Count of emails # ${listOfEmail.size}")
        Log.d(_tag, "Showing email # $listOfEmail")

        // 2. Make test for random
        val listOfRandomEmail = viewModel.loadRandomEmail()
        Log.d(_tag, "Count of email # ${listOfRandomEmail.size}")
        Log.d(_tag, "Showing email # $listOfRandomEmail")

    }



}