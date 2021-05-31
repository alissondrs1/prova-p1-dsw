package com.example.q3.controller

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.q3.model.EMail


class ListViewModel : ViewModel() {

    private val _tag = "ListViewModel"

    override fun onCleared() {
        Log.d(_tag, "Called :: onCleared()")
        super.onCleared()
    }

    fun loadEmail(): List<EMail> {

        val listOf = listOf(
            EMail(
                subject = "Alisson",
                to = "@"),
            EMail(
                subject = "Daniel",
                to = "@"
            )
        )
        Log.d(_tag ,"Called")
        return listOf


}
    fun loadRandomEmail(): List<EMail>{
        val maxRangeOfEMail = 1..100
        val myLisRandomEmail: ArrayList<EMail> = arrayListOf()
        for(i in maxRangeOfEMail){
            val aEmail= makeEmailAleatory()
            myLisRandomEmail.add(aEmail)
        }
        return myLisRandomEmail
    }
private fun makeEmailAleatory(): EMail{
    val id = ((Math.random()%100)*100+1).toLong()
    return EMail(subject = "Name Random $id", to = "@" )
}

    fun loadUserData(any: Any?) {

    }
}
