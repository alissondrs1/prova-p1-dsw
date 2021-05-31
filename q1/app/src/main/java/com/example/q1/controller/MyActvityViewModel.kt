package com.example.q1.controller

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.q1.model.Items
import java.util.ArrayList

class MyActvityViewModel: ViewModel() {
    private val _tag = "MyActvityViewModel"
    override fun onCleared() {
        super.onCleared()
        Log.d(_tag, "Called :: onCleared()")
    }

    fun loadItems(): List<Items> {

        val listOf = listOf(
            Items(
                name = "Item 1",
                details = "Details"),
            Items(
                name = "Item 2",
                details = "Details"),

            Items(
                name = "Item 3",
                details = "Details")

        )
        Log.d(_tag, "Called :: loadFakeItems $listOf")
        return listOf
    }
    fun loadRandonItems():List<Items>{
        val maxRangeOfItems = 1..100
        val myListRandomItems: ArrayList<Items> = arrayListOf()

        for(i in maxRangeOfItems){
            val aItems = makeItemsAleatory()
            myListRandomItems.add(aItems)
        }
        return myListRandomItems
    }

    private fun makeItemsAleatory(): Items{
        val id = ((Math.random()%100)*100+1).toLong()
        return Items(name = "name random $id", details =  "Details $id")
    }
}